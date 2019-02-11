package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageMembre
 */
public class PageMembre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageMembre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// r�cup�rer les informations du logg� et les afficher
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageMembre/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// r�cup�rer le formulaire, comparer � la liste des membres, si email ou pseudo ou (pr�nom et nom) correspond � un autre membre, renvoyer erreur
		// sinon, modifier les informations du logg� et le renvoyer vers espace membre
		
		doGet(request, response);
	}

}
