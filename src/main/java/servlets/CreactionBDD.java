package servlets;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Membres;
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import enumerations.Categories;
import enumerations.Niveaux;

/**
 * Servlet implementation class CreactionBDD
 */
public class CreactionBDD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreactionBDD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO TEST gestionnaire
		List<Tags> tags = new ArrayList<Tags>();
		Articles article = new Articles(1,"Yoyo",new Membres("Bob", "Moran", "Bobby", "youhou", "loulou@gmail.com", Niveaux.JOURNALISTE), Categories.FINANCE,"Yo man je fais de la finance yo yo",tags,0);

		GestionnaireArticle gArt = new GestionnaireArticle();
		gArt.addArticle(article);
//		Articles recupArticle = gArt.getArticleById(1);
//		if (article==recupArticle) {
//			System.out.println("ça colle");
//			recupArticle.setTitre("Walou");
//			gArt.updateArticle(recupArticle.getId());
//			System.out.println(gArt.getArticleById(1).getTitre());
//		}
//		
//		gArt.deleteArticleById(1);
//		if (gArt.getArticleById(1)==null) {
//			System.out.println("c'est bien delete");
//		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
