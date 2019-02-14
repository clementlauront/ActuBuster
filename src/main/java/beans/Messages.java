package beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Messages {

	// attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="CONTENU", columnDefinition="TEXT")
	private String contenu;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="OBJET")
	private String objet;
	
	@Column(name="DATE")
	private String date;
	
	//getters et setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}
	
	// constructeurs
	
	public Messages(String prenom, String contenu, String email, String nom, String objet) {
		super();
		this.prenom = prenom;
		this.contenu = contenu;
		this.email = email;
		this.nom = nom;
		this.objet = objet;
		String format = "dd/MM/yy H:mm:ss";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
		java.util.Date dateActuelle = new java.util.Date();
		this.date = formater.format( dateActuelle ); 
	}

	public Messages() {
	}
	
	// méthodes

}
