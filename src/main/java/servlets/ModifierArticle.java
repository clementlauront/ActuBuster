package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Articles;
import beans.Membres;
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import enumerations.Categories;
import enumerations.Niveaux;

/**
 * Servlet implementation class ModifierArticle
 */
public class ModifierArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		// ici, si pas de session active, session devient == null
		// si getSession(true), si pas de session active, session est crée et donc != null
		if (request.getParameter("idArticleAModifier")!=null) {
		
		if (session != null) {
			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
			if (loggeur.getNiveaux() == Niveaux.JOURNALISTE) { // Si une session journaliste existe, on donne accès à la page

		// récupérer l'article à modifier
		GestionnaireArticle gestA = new GestionnaireArticle();
		Articles article = gestA.getArticleById(Integer.parseInt(request.getParameter("idArticleAModifier")));
		List<Tags> tags = article.getTags();

		// envoyer les articles du loggeur au JSP
		request.setAttribute("articleAModifier", article);
		request.setAttribute("tagsArticle", tags);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pageModifierArticle/index.jsp").forward(request,
				response);
			} 
		}
		}
		// Sinon, on affiche la page d'acceuil
		response.sendRedirect("/Accueil");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// instancier les variables temporaires
		GestionnaireArticle gestA = new GestionnaireArticle();
		ArrayList<Articles> articles = gestA.getAllArticles();

		// récupérer le formulaire
		String titre = request.getParameter("titre");// ici, "titre" correspond au name="titre" dans le formulaire jsp
		String contenu = request.getParameter("contenu");
		String chapeau = request.getParameter("chapeau");
		String[] tagsEnString = request.getParameterValues("tags");
		int id = Integer.parseInt(request.getParameter("id"));
		ArrayList<Tags> tags = new ArrayList<Tags>();

		// comparer à la liste des articles si le titre est déjà utilisé
		for (Articles a : articles) {
			if (a.getTitre().equalsIgnoreCase(titre)) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pageModifierArticle/articleNonModifie.jsp")
						.forward(request, response);
			}
		}

		// si il n'y a pas de problème, on modifie l'article
		Articles articleAModifier = gestA.getArticleById(id);
		articleAModifier.setChapeau(chapeau);
		articleAModifier.setContenu(contenu);
		articleAModifier.setTitre(titre);
		for (int i = 0; i < tagsEnString.length; i++) {
			tags.add(new Tags(tagsEnString[i]));
		}
		articleAModifier.setTags(tags);
		if (!request.getParameter("categorie").equals("AUCUNE")) {
			articleAModifier.setCategorie(Categories.valueOf(request.getParameter("categorie")));
		}

		gestA.updateArticle(articleAModifier);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageModifierArticle/articleModifie.jsp").forward(request,
				response);
	}

}
