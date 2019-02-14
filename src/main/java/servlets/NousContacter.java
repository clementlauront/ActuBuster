package servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.bridge.Message;

import beans.gestion.GestionnaireMessages;

/**
 * Servlet implementation class NousContacter
 */
public class NousContacter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NousContacter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/pageNousContacter/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GestionnaireMessages gestMes = new GestionnaireMessages();
		
		//récupérer le formulaire
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String objet = request.getParameter("objet");
		String commentaire = request.getParameter("commentaire");
		
		//récupérer la date actuelle
		String format = "dd/MM/yy H:mm:ss";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
		java.util.Date dateActuelle = new java.util.Date();
		String date = formater.format( dateActuelle ); 
		
		// créer le message
		beans.Messages message = new beans.Messages(prenom, commentaire, email, nom, objet, date);
		
		// ajouter le message en mémoire
		gestMes.addMessage(message);
		
		
		doGet(request, response);
	}

}
