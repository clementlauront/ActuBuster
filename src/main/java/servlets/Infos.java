package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Membres;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// récupérer les infos de log et afficher les infos du loggé (si non loggé,
				// afficher un truc du genre "invité").
				// récupérer les infos de l'article et les afficher.
//TODO
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageInfos/index.jsp").forward(request,
						response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupérer la session
		HttpSession session = request.getSession(false);
		
		// Récupérer les informations du formulaire
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("mdp");
		String passwordVerif = request.getParameter("mdp2");
		Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
		
		// comparer à la liste des membres, si email ou pseudo ou (prénom et nom) correspond à un autre membre, renvoyer erreur
		
		// modifier l'instance de loggeur
		if (!password.equals("") || password.equals(passwordVerif)) {
			
		} else {
			loggeur.setEmail(email);
			loggeur.setNom(nom);
			loggeur.setPrenom(prenom);
			loggeur.setPseudo(pseudo);
		}
		



		// modifier les informations du loggeur et de la DATABASE et le renvoyer vers espace membre
		
		doGet(request, response);
	}

}
