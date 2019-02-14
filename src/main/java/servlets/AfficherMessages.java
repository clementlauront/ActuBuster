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
import beans.Messages;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import beans.gestion.GestionnaireMessages;
import enumerations.Niveaux;

/**
 * Servlet implementation class Messages
 */
public class AfficherMessages extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherMessages() {
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
			if (loggeur.getNiveaux() == Niveaux.ADMIN) { // Si une session admin existe, on donne accès à la page

				// on  récupère la liste de messages
				GestionnaireMessages gestMes = new GestionnaireMessages();
				ArrayList<Messages> messages = gestMes.getAllMessages();

				
				// on transmet les listes de messages
				request.setAttribute("listeMessages", messages);

				this.getServletContext().getRequestDispatcher("/WEB-INF/pageMessages/index.jsp")
						.forward(request, response);

			} else { // Sinon, on affiche la page d'acceuil
				response.sendRedirect("/ActuBuster/Accueil");
			}
		} else {
			response.sendRedirect("/ActuBuster/Accueil");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GestionnaireMessages gestMes = new GestionnaireMessages();
		 
		String[] idMessagesASupprimer = request.getParameterValues("messagesASupprimer");

		if (idMessagesASupprimer!=null) {
			// supprimer les messages à supprimer
			for (int i = 0; i < idMessagesASupprimer.length; i++) {
				gestMes.deleteMessageById(Integer.parseInt(idMessagesASupprimer[i]));
			}
		}
		
		doGet(request, response);
	}

}
