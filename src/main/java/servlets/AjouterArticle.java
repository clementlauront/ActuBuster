package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Articles;
import beans.Membres;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import enumerations.Niveaux;

/**
 * Servlet implementation class AjouterArticle
 */
public class AjouterArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterArticle() {
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
			if (loggeur.getNiveaux() == Niveaux.JOURNALISTE) { // Si une session journaliste existe, on donne accès à la page
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageAjouterArticle/index.jsp").forward(request, response);
			} else { // Sinon, on affiche la page d'inscription.
				response.sendRedirect("/Accueil");
			}
		} else {
			response.sendRedirect("/Accueil");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//instancier les variables temporaires
		GestionnaireArticle gestA = new GestionnaireArticle();
		boolean creationPossible = true;
		String messageErreur = "";
		ArrayList<Articles> articles = gestA.getAllArticles();
		
		//récupérer le formulaire
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
		}
		

		if (creationPossible) { // si il n'y a pas de problème, on créer le membre
			Membres nouveauMembre = new Membres(prenom, nom, pseudo, password, email, niveau);
			gestM.addMembre(nouveauMembre);
			
			//créer la session loggée et renvoyer vers la pageAccueil
			HttpSession session = request.getSession(true);
			session.setAttribute("LOGGEUR", nouveauMembre);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
			
		} else { // sinon envoyer le message d'erreur, renvoyer vers pageConnexion
			request.setAttribute("messageErreur", messageErreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageConnexion/index.jsp").forward(request, response);
		}
		// récupérer les informations du nouvel article par formulaire et créer le nouvel article (faire vérif de titre pour pas que deux articles eaient le même titre ?)
		
		doGet(request, response);
	}

}
