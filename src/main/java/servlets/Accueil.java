package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import enumerations.Categories;

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
		Articles article = new Articles(1,"Yoyo",Categories.FINANCE,"Yo man je fais de la finance yo yo",new Tags(1,"yo"),0);
		GestionnaireArticle gArt = new GestionnaireArticle();
		gArt.addArticle(article);
		Articles recupArticle = gArt.getArticleById(1);
		if (article==recupArticle) {
			System.out.println("�a colle");
			recupArticle.setTitre("Walou");
			gArt.updateArticle(recupArticle.getId());
			System.out.println(gArt.getArticleById(1).getTitre());
		}
		
		
		
				
				
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
