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
			if (loggeur.getNiveaux() == Niveaux.JOURNALISTE) { // Si une session journaliste existe, on donne acc�s � la page
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
		
		//r�cup�rer le formulaire
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
			
			//cr�er la session logg�e et renvoyer vers la pageAccueil
			HttpSession session = request.getSession(true);
			session.setAttribute("LOGGEUR", nouveauMembre);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageAccueil/index.jsp").forward(request, response);
			
		} else { // sinon envoyer le message d'erreur, renvoyer vers pageConnexion
			request.setAttribute("messageErreur", messageErreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageConnexion/index.jsp").forward(request, response);
		}
		// r�cup�rer les informations du nouvel article par formulaire et cr�er le nouvel article (faire v�rif de titre pour pas que deux articles eaient le m�me titre ?)
		
		doGet(request, response);
	}

}
