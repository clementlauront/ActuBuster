package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import beans.gestion.GestionnaireTags;

/**
 * Servlet implementation class ArticlesRecherche
 */
public class ArticlesRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticlesRecherche() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/pageArticlesRecherche/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instancier les variables temporaires
		GestionnaireMembres gestM = new GestionnaireMembres();
		GestionnaireArticle gArt = new GestionnaireArticle();
		GestionnaireTags gTags= new GestionnaireTags();
		String messageRecherche ="";
		boolean research = false;

		
		//récupérer le forumulaire
		String text = (String) request.getParameter("search");
		System.out.println(text);
		//Instanciation des iterators pour lire les listes
		ArrayList<Articles> listArticles = gArt.getAllArticles();
		ArrayList<Tags> listTags = gTags.getAllTags();
		
		Iterator<Articles> itArticle = listArticles.iterator();
		Iterator<Tags> itTags = listTags.iterator();
 
		ArrayList<Articles> articleResultat = new ArrayList<Articles>();
		
		while(itArticle.hasNext()) {
			
			Articles articleRecherche= itArticle.next();
			
			System.out.println(articleRecherche.getTitre());
			System.out.println(articleRecherche.getChapeau());
			System.out.println(articleRecherche.getContenu());
			System.out.println(articleRecherche.getAuteur().getPseudo());
			System.out.println(text);


			//Rechercher par le titre
			if(articleRecherche.getTitre().contains(text)) {
				articleResultat.add(articleRecherche);
				research = true;

				
				//Rechercher par le chapeau	
			}else if (articleRecherche.getChapeau().contains(text)) {
				articleResultat.add(articleRecherche);
				research = true;
			
				
				//Rechercher par le contenu
			}else if (articleRecherche.getContenu().contains(text)) {
				articleResultat.add(articleRecherche);
				research = true;
	
			
				//Rechercher par auteur
			}else if (text.equalsIgnoreCase(articleRecherche.getAuteur().getPseudo())
					||text.equalsIgnoreCase(articleRecherche.getAuteur().getNom())
					||text.equalsIgnoreCase(articleRecherche.getAuteur().getPrenom()))  {
				articleResultat.add(articleRecherche);
				research = true;
			
				//Rechercher par tags
//			}else if (text.equals(tagRecherche.getTags())) {
//				
			}else {
				messageRecherche = "Aucun résultat correspond à votre recherche";
		
			}
		}

		if(research == true ) {
			messageRecherche="";
			request.setAttribute("listeArticle", articleResultat);

		}
		if(research == false ) {
			messageRecherche="";
			request.setAttribute("listeArticle", listArticles);
		}
		request.setAttribute("listeArticle", articleResultat);
		request.setAttribute("noFound", messageRecherche);
		doGet(request, response);
	}

}
