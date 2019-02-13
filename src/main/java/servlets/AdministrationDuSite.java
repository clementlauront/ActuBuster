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
 * Servlet implementation class AdministrationDuSite
 */
public class AdministrationDuSite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdministrationDuSite() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		HttpSession session = request.getSession(false);
//
//		if (session != null) {
//			Membres loggeur = (Membres) session.getAttribute("LOGGEUR");
//			if (loggeur.getNiveaux() == Niveaux.ADMIN) { // Si une session admin existe, on donne accès à la page

				
				GestionnaireArticle gestA = new GestionnaireArticle();
				GestionnaireMembres gestM = new GestionnaireMembres();
				ArrayList<Membres> membres = gestM.getAllMembres();
				ArrayList<Membres> admins = new ArrayList<Membres>();
				for (Membres m : membres) {
					if (m.getNiveaux().equals(Niveaux.ADMIN)) {
						admins.add(m);
						//membres.remove(m);
					}
				}
				ArrayList<Articles> articles = gestA.getAllArticles();
				
				// on transmet les listes de membres, d'admins et d'articles
				request.setAttribute("listeMembres", membres);
				request.setAttribute("listeAdmins", admins);
				request.setAttribute("listeArticles", articles);
				System.out.println(membres.size());
				System.out.println(membres);

				this.getServletContext().getRequestDispatcher("/WEB-INF/pageAdministrationDuSite/index.jsp")
						.forward(request, response);

//			} else { // Sinon, on affiche la page d'acceuil
//				response.sendRedirect("/ActuBuster/Accueil");
//			}
//		} else {
//			response.sendRedirect("/ActuBuster/Accueil");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// instancier les variables temporaires
		GestionnaireArticle gestA = new GestionnaireArticle();
		GestionnaireMembres gestM = new GestionnaireMembres();

		// récupérer le formulaire
		String[] idArticlesASupprimer = request.getParameterValues("ArticlesASupprimer");
		String[] idMembresASupprimer = request.getParameterValues("membresASupprimer");

		// supprimer les articles à supprimer
		for (int i = 0; i < idArticlesASupprimer.length; i++) {
			gestA.deleteArticleById(Integer.parseInt(idArticlesASupprimer[i]));
		}

		// supprimer les membres à supprimer
		for (int i = 0; i < idMembresASupprimer.length; i++) {
			gestM.deleteMembreById(Integer.parseInt(idMembresASupprimer[i]));
		}

		doGet(request, response);
	}

}
