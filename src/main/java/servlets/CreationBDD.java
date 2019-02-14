package servlets;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Articles;
import beans.Membres;
import beans.Tags;
import beans.gestion.GestionnaireArticle;
import beans.gestion.GestionnaireMembres;
import beans.gestion.GestionnaireTags;
import enumerations.Categories;
import enumerations.Niveaux;

/**
 * Servlet implementation class CreactionBDD
 */
public class CreationBDD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationBDD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO TEST gestionnaire
		
		//Creation Tags
		Tags giletsJaune = new Tags("Gilets Jaunes");
		Tags france = new Tags("France");
		Tags cinema = new Tags("cinéma");
		List<Tags> tags = new ArrayList<Tags>();
		tags.add(cinema);
		tags.add(france);
		tags.add(giletsJaune);
		

		//Creation Membres 
		Membres bob = new Membres("Bob", "MORAN", "Bobby", "youhou", "loulou@gmail.com", Niveaux.JOURNALISTE);
		Membres boa = new Membres("Boa", "SERPENT", "Ka", "juju", "prems@gmail.com", Niveaux.JOURNALISTE);
		Membres boc = new Membres("Benjamin", "FRANKLIN", "Pres", "jaja", "deuz@gmail.com", Niveaux.JOURNALISTE);
		Membres bod = new Membres("Babar", "KING", "Elephant", "jojo", "trez@gmail.com", Niveaux.JOURNALISTE);
		Membres boe = new Membres("Bill", "MURRAY", "Tavu", "jiji", "quart@gmail.com", Niveaux.JOURNALISTE);
		
		Membres adminClement = new Membres("Clément", "LAURONT", "BobleBoss", "BobLeponge", "bobleponge@gmail.com", Niveaux.ADMIN);
		Membres adminAlexandre = new Membres("Alexandre", "GRONDIN", "FatSushi", "oldot@ku974", "a.grondin@gmail.com", Niveaux.ADMIN);
		Membres adminAndrea = new Membres("Andrea", "FONTENEAU", "LaDocDu44", "ILOVEMEDECINE", "andrea.fonteneau@gmail.com", Niveaux.ADMIN);

		// Creation Articles
		Articles article = new Articles("Yoyo",bob, Categories.FINANCE,"Yo man je fais de la finance yo yo", "Yo finance", tags,2);
		
		Articles article1 = new Articles("Regarder des films nuissent-ils à la santé ?",
											boe, Categories.GENERALE, "Avant toute chose, le cinéma est un milieu très vaste."
													+ "J'adore les films et plus particulièrement les comédies musicales, quand ça danse et ça chante."
													+ "Maintenant, la question est de savoir si regarder des films peut-il avoir une influence sur notre quotidien, notre sommeil ?"
													+ "On pourrait penser que non alors qu'en réalité : oui, cela peut nuire à notre santé !",
													"Les films c'est bien mais à petite dose les loulous.",
													tags,150);
		
		Articles article2= new Articles("L'informatique, c'est dur", boa, Categories.TECHNOLOGIE, 
										"Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
										+ "Vivamus suscipit velit non maximus consequat. Cras scelerisque ligula et erat ullamcorper, nec luctus ante blandit."
										+ " Aliquam volutpat nunc ante, sed luctus odio iaculis ut. Cras porttitor, eros sit amet dignissim tempus, justo nulla feugiat justo, vitae eleifend tortor urna egestas lacus. "
										+ "	Donec bibendum nisl eget neque consequat eleifend.", "Si vous vous lancez dans l'informatique, fuyez pauvre fous.", tags, 50);
		
		Articles articles3 = new Articles("Blizzard va t-il faire faillite ?", boc, Categories.JEUXVIDEO, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Vivamus suscipit velit non maximus consequat. Cras scelerisque ligula et erat ullamcorper, nec luctus ante blandit."
				+ " Aliquam volutpat nunc ante, sed luctus odio iaculis ut. Cras porttitor, eros sit amet dignissim tempus, justo nulla feugiat justo, vitae eleifend tortor urna egestas lacus. "
				+ "	Donec bibendum nisl eget neque consequat eleifend.", "Le grand Papa de Warcraft et de Diablo est en train de perdre son punlic.", tags, 250);
		
											
		
		//Instanciation Gestionnaires
		GestionnaireArticle gArt = new GestionnaireArticle();
		GestionnaireMembres gMembre = new GestionnaireMembres();
		GestionnaireTags gTags = new GestionnaireTags();
		
		// Ajout de membres dans la BDD
		gMembre.addMembre(adminAndrea);
		gMembre.addMembre(adminClement);
		gMembre.addMembre(adminAlexandre);
		gMembre.addMembre(bob);
		gMembre.addMembre(boc);
		gMembre.addMembre(boa);
		gMembre.addMembre(bod);
		gMembre.addMembre(boe);
		
		// Ajout d'articles dans la BDD
		gArt.addArticle(article);
		gArt.addArticle(article1);
		gArt.addArticle(article2);
		gArt.addArticle(articles3);
		
		// Ajout de tags dans la BDD
//		gTags.addTag(cinema);
//		gTags.addTag(france);
//		gTags.addTag(giletsJaune);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
