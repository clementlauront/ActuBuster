package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Membres;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import enumerations.Niveaux;
import fr.agrondin.objects.LoginPostName;

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
			if (session.getAttribute() != null) {
				// Si une session existe, on redirige sur accueil
				response.sendRedirect("/Accueil");
			} else {
				// Sinon, on affiche la page d'enregistrement.
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageInscription/index.jsp").forward(request, response);
			}
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageInscription/index.jsp").forward(request, response);
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
		
		//récupérer le forumulaire
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Niveaux niveau = Niveaux.valueOf(request.getParameter("niveau"));


		// comparer à la liste des membres si email ou pseudo ou (prénom et nom) correspond à un membre déjà existant
		for (Membres m : membres) {
			if (m.getPseudo()==pseudo) {
				creationPossible = false;
				messageErreur = "Ce pseudo est déjà utilisé par un autre compte, veuillez en choisir un autre.";
				break;
			}
			if (m.getEmail()==email) {
				creationPossible = false;
				messageErreur = "Il y a déjà un compte rattaché à cet E-mail.";
				break;
			}
			if (m.getPrenom()==prenom && m.getNom()==nom) {
				creationPossible = false;
				messageErreur = "Il y a déjà un compte rattaché à ce nom et ce prénom.";
				break;
			}
		}
		

		if (creationPossible) { // si il n'y a pas de problème, on créer le membre
			Membres nouveauMembre = new Membres(prenom, nom, pseudo, password, email, niveau);
			gestM.addMembre(nouveauMembre);
		} else { // sinon envoyer le message d'erreur, renvoyer vers pageInscription et mettre fin au doPost
			request.setAttribute("messageErreur", messageErreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageInscription/index.jsp").forward(request, response);
		}
		
		// connecter le nouveau membre et renvoyer vers la pageAccueil
		//TODO créer la session loggée
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
