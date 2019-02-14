package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Membres;
import beans.gestion.GestionnaireMembres;
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
		// r�cup�rer les infos de log et afficher les infos du logg� (si non logg�,
		// afficher un truc du genre "invit�").
		// r�cup�rer les infos de l'article et les afficher.

		HttpSession session = request.getSession(false);
		// ici, si pas de session active, session devient == null
		// si getSession(true), si pas de session active, session est cr�e et donc !=
		// null

		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getNiveaux() == Niveaux.ADMIN || loggeur.getNiveaux() == Niveaux.JOURNALISTE
					|| loggeur.getNiveaux() == Niveaux.CLIENT) {
				// Si une session admin/journaliste/client existe, on donne acc�s � la page

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

		// instancier les variables temporaires
		GestionnaireMembres gestM = new GestionnaireMembres();

		// r�cup�rer le forumulaire
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String pseudo = request.getParameter("pseudo");
		String email = request.getParameter("email");
		String password = request.getParameter("mdp");
		String passwordConf = request.getParameter("mdp2");
		int id = Integer.parseInt(request.getParameter("id"));

		if (!nom.equals("")) {
			System.out.println("nom rempli");
			HttpSession session = request.getSession(false);
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			loggeur.setNom(nom);
			gestM.updateMembre(loggeur);
		} else {
			System.out.println("nom vide");
		}

		if (!prenom.equals("")) {
			System.out.println("prenom rempli");
			HttpSession session = request.getSession(false);
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			loggeur.setPrenom(prenom);
			gestM.updateMembre(loggeur);
		} else {
			System.out.println("prenom vide");
		}

		if (!pseudo.equals("")) {
			System.out.println("pseudo rempli");
			HttpSession session = request.getSession(false);
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			loggeur.setPseudo(pseudo);
			gestM.updateMembre(loggeur);
		} else {
			System.out.println("pseudo vide");
		}

		if (!email.equals("")) {
			System.out.println("email rempli");
			HttpSession session = request.getSession(false);
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			loggeur.setEmail(email);
			gestM.updateMembre(loggeur);
		} else {
			System.out.println("email vide");
		}

		if (!password.equals("")) {
			if (!passwordConf.equals("")) {
				System.out.println("passwords remplis");

				if (password.equals(passwordConf)) {
					HttpSession session = request.getSession(false);
					Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
					loggeur.setPassword(password);
					gestM.updateMembre(loggeur);
				} else {
					System.out.println("passwords diff�rents");
				}
			} else {
				System.out.println("password vide");
			}

		} response.sendRedirect("Infos");


	}

}
