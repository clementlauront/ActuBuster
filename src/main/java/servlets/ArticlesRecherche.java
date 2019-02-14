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

		//récupérer les infos de log et afficher les infos du loggé (si non loggé, afficher un truc du genre "invité").
		//récupérer la liste des articles et l'afficher
		
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
 
		while(itArticle.hasNext()) {
			
			Articles articleRecherche= itArticle.next();
			
			System.out.println(articleRecherche.getTitre());
			System.out.println(articleRecherche.getChapeau());
			System.out.println(articleRecherche.getContenu());
			System.out.println(articleRecherche.getAuteur().getPseudo());
			System.out.println(text);


			//Rechercher par le titre
			if(articleRecherche.getTitre().contains(text)) {
				List<Articles> article = gArt.getArticlesByTitre(text);
				request.setAttribute("listeArticle", article);
				research = true;
				
				//Rechercher par le chapeau	
			}else if (articleRecherche.getChapeau().contains(text)) {
				List<Articles> article = gArt.getArticlesByChapeau(text);
				request.setAttribute("listeArticle", article);
				research = true;
				
				//Rechercher par le contenu
			}else if (articleRecherche.getContenu().contains(text)) {
				List<Articles> article = gArt.getArticlesByContenu(text);
				request.setAttribute("listeArticle", article);
				research = true;
			
				//Rechercher par auteur
			}else if (text.equals(articleRecherche.getAuteur().getPseudo())) {
				List<Articles> article = gArt.getArticlesByAuteur(text);
				request.setAttribute("listeArticle", article);
				research = true;

				//Rechercher par tags
//			}else if (text.equals(tagRecherche.getTags())) {
//				
			}else {
				messageRecherche = "Aucun résultat correspond à votre recherche";
			}
		}

		if(research) {
			messageRecherche="";
		}
		request.setAttribute("noFound", messageRecherche);
		doGet(request, response);
	}

}
