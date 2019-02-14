package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Articles;
import beans.Membres;

/**
 * Servlet implementation class ArticleDetail
 */
public class ArticleDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//récupérer les infos de log et afficher les infos du loggé (si non loggé, afficher un truc du genre "invité").
		
		
		// récupérer les infos de l'article et les afficher.
		HttpSession session = request.getSession(false);
		Articles articleEnCours = (Articles) session.getAttribute("ARTICLE");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageArticleDetail/index.jsp").forward(request, response);
		
		request.setAttribute("titre", articleEnCours.getTitre());
		request.setAttribute("categorie", articleEnCours.getCategorie());
		request.setAttribute("tags", articleEnCours.getTags());
		request.setAttribute("chapeau", articleEnCours.getChapeau());
		request.setAttribute("contenu", articleEnCours.getContenue());
		request.setAttribute("auteur", articleEnCours.getAuteur().getPseudo());
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
