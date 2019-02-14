package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Articles;
import beans.Membres;
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
<<<<<<< HEAD
		request.setAttribute("Liste1", article1.getTags());
		request.setAttribute("id1", article1.getId());
		
		
		request.setAttribute("TitreArticle2", article2);
		request.setAttribute("Liste2", article2.getTags());

		
=======
		request.setAttribute("Liste1", liste1);
		request.setAttribute("TitreArticle2", article2);
		request.setAttribute("Liste2", liste2);
>>>>>>> db4865bc86bdf2952dfb7461b7ca34ebcb481d88
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionnaireArticle gArt = new GestionnaireArticle();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		HttpSession session = request.getSession(true);
		Articles articleEnCours = gArt.getArticleById(id);
		session.setAttribute("ARTICLE", articleEnCours);
		response.sendRedirect("/ActuBuster/ArticleDetail");
		
	}

}
