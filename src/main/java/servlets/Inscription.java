package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Membres;
import beans.gestion.GestionnaireMembres;
import enumerations.Niveaux;

/**
 * Servlet implementation class Inscription
 */
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getEmail() != null) { // Si une session existe, on redirige sur accueil
				response.sendRedirect("/Accueil");
			} else { // Sinon, on affiche la page d'inscription.
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageConnexion/index.jsp").forward(request, response);
			}
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageConnexion/index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//instancier les variables temporaires
		GestionnaireMembres gestM = new GestionnaireMembres();
		boolean creationPossible = true;
		String messageErreur = "";
		ArrayList<Membres> membres = gestM.getAllMembres();
		
		//r�cup�rer le forumulaire
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("mdp");
		String passwordConf = request.getParameter("mdp2");
		Niveaux niveau = Niveaux.valueOf(request.getParameter("niveau"));


		// comparer � la liste des membres si email ou pseudo ou (pr�nom et nom) correspond � un membre d�j� existant
		for (Membres m : membres) {
			if (m.getPseudo()==pseudo) {
				creationPossible = false;
				messageErreur = "Ce pseudo est d�j� utilis� par un autre compte, veuillez en choisir un autre.";
				break;
			}
			if (m.getEmail()==email) {
				creationPossible = false;
				messageErreur = "Il y a d�j� un compte rattach� � cet E-mail.";
				break;
			}
		}
		

		if (creationPossible) { // si il n'y a pas de probl�me, on cr�er le membre
			Membres nouveauMembre = new Membres(prenom, nom, pseudo, password, email, niveau);
			gestM.addMembre(nouveauMembre);
			
			//cr�er la session logg�e
			HttpSession session = request.getSession(true);
			session.setAttribute("LOGGEUR", nouveauMembre);
			
		} else { // sinon envoyer le message d'erreur
			request.setAttribute("messageErreur", messageErreur);
		}
		
		// renvoyer vers la page adapt�e
		doGet(request, response);
		

	}

}
