package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Membres;
import beans.gestion.GestionnaireArticle;
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
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageInscription/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//instancier les variables temporaires
		GestionnaireMembres gestM = new GestionnaireMembres();
		boolean creationPossible = true;
		String message = "";
		ArrayList<Membres> membres = gestM.getAllMembres();
		
		//r�cup�rer le forumulaire
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Niveaux niveau = Niveaux.valueOf(request.getParameter("niveau"));


		// comparer � la liste des membres si email ou pseudo ou (pr�nom et nom) correspond � un membre d�j� existant
		for (Membres m : membres) {
			if (m.getPseudo()==pseudo) {
				creationPossible = false;
				message = "Ce pseudo est d�j� utilis� par un autre compte, veuillez en choisir un autre.";
				break;
			}
			if (m.getEmail()==email) {
				creationPossible = false;
				message = "Il y a d�j� un compte rattach� � cet E-mail.";
				break;
			}
			if (m.getPrenom()==prenom && m.getNom()==nom) {
				creationPossible = false;
				message = "Il y a d�j� un compte rattach� � ce nom et ce pr�nom.";
				break;
			}
		}
		

		if (creationPossible) { // si il n'y a pas de probl�me, on cr�er le membre
			Membres nouveauMembre = new Membres(prenom, nom, pseudo, password, email, niveau);
			gestM.addMembre(nouveauMembre);
		} else { // sinon envoyer le message d'erreur, renvoyer vers pageInscription et mettre fin au doPost
			request.setAttribute("messageErreur", message);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageInscription/index.jsp").forward(request, response);
		}
		
		// connecter le nouveau membre et renvoyer vers la pageAccueil
		//TODO cr�er la session logg�e
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
