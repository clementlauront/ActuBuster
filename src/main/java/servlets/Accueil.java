package servlets;

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
//TODO Chercher une session et un membre + son niveau et le faire int�ragir avec le html
//		System.out.println(niveau);
//		request.setAttribute("niveau", niveau);
		//r�cup�rer les infos de log et afficher les infos du logg� (si non logg�, afficher un truc du genre "invit�").
		request.setAttribute("test", "test");
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
