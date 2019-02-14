package beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import enumerations.Categories;

@Entity
public class Articles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="TITRE")
	private String titre;
	
	@ManyToOne
	private Membres auteur;

	@Column
	private Categories categorie;
	
	@Column(name="CONTENU", columnDefinition="TEXT")
	private String contenu;
	
	@ManyToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Tags> tags;
	
	@Column(name="NOMBREVUES")
	private int nombreVues;
	
	@Column(name="CHAPEAU")
	private String chapeau;
	
	@Column(name="DATE")
	private String date;
	
	//getters et setters
	
	public String getChapeau() {
		return chapeau;
	}
	public void setChapeau(String chapeau) {
		this.chapeau = chapeau;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Membres getAuteur() {
		return auteur;
	}
	public void setAuteur(Membres auteur) {
		this.auteur = auteur;
	}
	public Categories getCategorie() {
		return categorie;
	}
	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getNombreVues() {
		return nombreVues;
	}
	public void setNombreVues(int nombreVues) {
		this.nombreVues=nombreVues;
	}
	
	/*
	 * =========
	 * Constructeur
	 * ========
	 * 
	 */
	public Articles() {
		
	}
	
	public Articles(String titre, Membres auteur, Categories categorie, String contenu, String chapeau, List<Tags> tags,int nombreVues) {
		super();
		this.titre = titre;
		this.categorie = categorie;
		this.contenu = contenu;
		this.chapeau = chapeau;
		this.tags = tags;
		this.nombreVues=nombreVues;
		this.auteur=auteur;
		
		String format = "dd/MM/yy H:mm:ss";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
		java.util.Date dateActuelle = new java.util.Date();
		this.date = formater.format( dateActuelle ); 
	}
	
	
	
}
