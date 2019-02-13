package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Membres;
import enumerations.Niveaux;

/**
 * Servlet implementation class Infos
 */
public class Infos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Infos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// récupérer les infos de log et afficher les infos du loggé (si non loggé,
		// afficher un truc du genre "invité").
		// récupérer les infos de l'article et les afficher.

		HttpSession session = request.getSession(false);
		// ici, si pas de session active, session devient == null
		// si getSession(true), si pas de session active, session est crée et donc !=
		// null

		
		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getNiveaux() == Niveaux.ADMIN
					|| loggeur.getNiveaux() == Niveaux.JOURNALISTE
					|| loggeur.getNiveaux() == Niveaux.CLIENT) {
				// Si une session admin/journaliste/client existe, on donne accès à la page
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageInfos/index.jsp").forward(request,
						response);
				request.setAttribute("nom", loggeur.getNom());
				request.setAttribute("prenom", loggeur.getPrenom());
				request.setAttribute("pseudo", loggeur.getPseudo());
				request.setAttribute("email", loggeur.getEmail());
				request.setAttribute("motdepasse", loggeur.getPassword());
				
			} else { // Sinon, on affiche la page d'acceuil
				response.sendRedirect("/Accueil");
			}
		} else {
			response.sendRedirect("/Accueil");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
