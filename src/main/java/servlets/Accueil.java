package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Tags;
import beans.gestion.GestionnaireArticle;

/**
 * Servlet implementation class Accueil
 */
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instancier les variables temporaires

		GestionnaireArticle gArt = new GestionnaireArticle();
		List<Articles> listArticles = gArt.getAllArticles();
		int rand =  (int) Math.floor(Math.random() * listArticles.size());
		int rand2 =  (int) Math.floor(Math.random() * listArticles.size());
		
		Articles article1 = listArticles.get(rand);
		Articles article2 = listArticles.get(rand2);
		List<Tags> liste1 = article1.getTags();
		List<Tags> liste2 = article2.getTags();
		
		request.setAttribute("TitreArticle1", article1);
		request.setAttribute("Liste1", liste1);
		request.setAttribute("TitreArticle2", article2);
		request.setAttribute("Liste2", liste2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
