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
import enumerations.Niveaux;

/**
 * Servlet implementation class ArticlesJournaliste
 */
public class ArticlesJournaliste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticlesJournaliste() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		// ici, si pas de session active, session devient == null
		// si getSession(true), si pas de session active, session est crée et donc != null
		
		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getNiveaux() == Niveaux.JOURNALISTE) { // Si une session journaliste existe, on donne accès à la page
				
				// récupérer tous les articles
				GestionnaireArticle gestA = new GestionnaireArticle();
				ArrayList<Articles> articles = gestA.getAllArticles();
				ArrayList<Articles> articlesDuLoggeur = new ArrayList<Articles>();
				
				// recenser les articles qui appartiennent au loggeur
				for (Articles art : articles) {
					if (art.getAuteur()==loggeur) {
						articlesDuLoggeur.add(art);
					}
				}
				
				// envoyer les articles du loggeur au JSP
				request.setAttribute("listeArticlesLoggeur", articlesDuLoggeur);
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageArticlesJournaliste/index.jsp").forward(request, response);
			} else { // Sinon, on affiche la page d'acceuil
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

		doGet(request, response);
	}

}
