package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Membres;
import beans.gestion.GestionnaireMembres;
import enumerations.Niveaux;

/**
 * Servlet implementation class Connexion
 */
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageConnexion/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instancier les variables temporaires
				GestionnaireMembres gestM = new GestionnaireMembres();
				String messageErreurConnexion = "";
				ArrayList<Membres> membres = gestM.getAllMembres();
				Iterator<Membres> itMembre = membres.iterator();
				boolean isNotConnected = true;

						
				//récupérer le forumulaire
				String pseudo = request.getParameter("pseudo");
				String email = request.getParameter("email");
				String password = request.getParameter("mdp");


				// comparer à la liste des membres si email ou pseudo ou (prénom et nom) correspond à un membre déjà existant
		while (itMembre.hasNext()) {
			System.out.println("iterator : ok");
			Membres m = itMembre.next();
			if (m.getPseudo().equals(pseudo) || m.getEmail().equals(email)) {
				System.out.println("Pseudo et email : ok");
				if (m.getPassword().equals(password)) {
					System.out.println("mdp : ok");

					HttpSession session = request.getSession(true);
					session.setAttribute("LOGGEUR", m);
					response.sendRedirect("/ActuBuster/Accueil");
					isNotConnected = false;
					break;
				} else {
					System.out.println("mdp incorrect : ok");
					messageErreurConnexion = "Mot de passe incorrect.";
					break;
				}
			} else if (itMembre.hasNext() == false) {
				System.out.println("pseudo incorrect : ok");
				messageErreurConnexion = "Pseudo ou Email incorrect";
			}
		}
		if(isNotConnected) {
			System.out.println("IsNotConnected : ok");
			request.setAttribute("messageErreur", messageErreurConnexion);
			doGet(request, response);
		}
		
	}
}
