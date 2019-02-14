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
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import enumerations.Categories;
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
		// ici, si pas de session active, session devient == null
		// si getSession(true), si pas de session active, session est crée et donc != null
		
		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getNiveaux() == Niveaux.JOURNALISTE) { // Si une session journaliste existe, on donne accès à la page
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageAjouterArticle/index.jsp").forward(request, response);
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
		
		
		//instancier les variables temporaires
		GestionnaireArticle gestA = new GestionnaireArticle();
		boolean creationPossible = true;
		String messageErreur = "";
		ArrayList<Articles> articles = gestA.getAllArticles();
		
		//récupérer le formulaire
		String titre = request.getParameter("titre");// ici, "titre" correspond au name="titre" dans le formulaire jsp
		String contenu = request.getParameter("contenu");
		String chapeau = request.getParameter("chapeau");
		//TODO récupérer l'image de l'article
		Categories categorie = Categories.valueOf(request.getParameter("categorie"));
		ArrayList<Tags> tags = new ArrayList<Tags>();
		if (request.getParameter("tag1")!=null) {
			tags.add(new Tags(request.getParameter("tag1")));			
		}
		if (request.getParameter("tag2")!=null) {
			tags.add(new Tags(request.getParameter("tag2")));			
		}
		if (request.getParameter("tag3")!=null) {
			tags.add(new Tags(request.getParameter("tag3")));			
		}
		

		// comparer à la liste des articles si le titre est déjà utilisé
		for (Articles a : articles) {
			if (a.getTitre().equalsIgnoreCase(titre)) {
				creationPossible = false;
				messageErreur = "Ce titre est déjà utilisé par un autre article, veuillez en choisir un autre.";
				break;
			}
		}
		

		if (creationPossible) { // si il n'y a pas de problème, on créer l'article
			HttpSession session = request.getSession(false);
			Articles nouvelArticle = new Articles(titre, (Membres) session.getAttribute("LOGGEUR"), categorie, contenu, chapeau, tags, 0);
			gestA.addArticle(nouvelArticle);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pageAjouterArticle/articleAjoute.jsp").forward(request, response);
			
		} else { // sinon envoyer le message d'erreur
			request.setAttribute("messageErreur", messageErreur); // ici, "messageErreur" est crée et aura pour contenu messageErreur
			doGet(request, response);
		}
	}

}
