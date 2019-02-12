package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Membres;

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
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		String messageErreur ="";
		
		SessionFactory usine = new Configuration().configure().buildSessionFactory();
		Session gestionnaire = usine.openSession();
		
		@SuppressWarnings("unchecked")
		List<Membres> resultat = (List<Membres>) gestionnaire.createQuery("from Membres WHERE email = "+email+" AND PASSWORD = "+mdp).list();
		if(resultat.size() == 0) {
			messageErreur = "L'email ou le mot de passe que vous avez inscrit est incorrect.";
			request.setAttribute("messageErreur", messageErreur);
			//TODO Faire apparaitre message d'erreur
		}else if(resultat.size()==1) {
			HttpSession session = request.getSession(false) ;
			
			response.sendRedirect("/PageMembre");

		}
	}

}
