package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Membres;
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

		GestionnaireMembres gestM = new GestionnaireMembres();
		GestionnaireArticle gArt = new GestionnaireArticle();
		GestionnaireTags gTags= new GestionnaireTags();
		
		String text = (String) request.getAttribute("text");
		ArrayList<Articles> listArticles = gArt.getAllArticles();
		Iterator<Articles> itArticle = listArticles.iterator();
 
		while(itArticle.hasNext()) {
			Articles articleRecherche= itArticle.next();
			if(text.equals(articleRecherche.getTitre())) {
				
				
			}else if (text.equals(articleRecherche.getContenue())) {
				
			}else if (text.equals(articleRecherche.getAuteur())) {
				
			}
		}
		
		doGet(request, response);
	}

}
