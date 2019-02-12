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
				String messageErreur = "";
				ArrayList<Membres> membres = gestM.getAllMembres();
				Iterator<Membres> itMembre = membres.iterator();
				boolean isNotConnected = true;

						
				//r�cup�rer le forumulaire
				String pseudo = request.getParameter("pseudo");
				String email = request.getParameter("email");
				String password = request.getParameter("password");


				// comparer � la liste des membres si email ou pseudo ou (pr�nom et nom) correspond � un membre d�j� existant
		while (itMembre.hasNext()) {
			Membres m = itMembre.next();
			if (m.getPseudo() == pseudo || m.getEmail() == email) {
				if (m.getPassword() == password) {
					HttpSession session = request.getSession(true);
					session.setAttribute("LOGGEUR", m);
					response.sendRedirect("/Accueil");
					isNotConnected = false;
					break;
				} else {
					messageErreur = "Mot de passe incorrect.";
					break;
				}
			} else if (itMembre.hasNext() == false) {
				messageErreur = "Pseudo ou Email incorrect";
			}
		}
		if(isNotConnected) {
			request.setAttribute("messageErreur", messageErreur);
			doGet(request, response);
		}
		
	}
}
