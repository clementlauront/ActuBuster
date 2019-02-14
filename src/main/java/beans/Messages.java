package beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Messages {

	// attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="CONTENU")
	private String contenu;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="OBJET")
	private String objet;
	
	@Column(name="DATE")
	private Date date;
	
	//getters et setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
	
	public Messages(int id, String prenom, String contenu, String email, String nom, String objet, Date date) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.contenu = contenu;
		this.email = email;
		this.nom = nom;
		this.objet = objet;
		this.date = date;
	}

	public Messages() {
	}
	
	// méthodes

}
