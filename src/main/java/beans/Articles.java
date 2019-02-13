package beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import enumerations.Categories;
import enumerations.Niveaux;

@Entity
public class Articles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="TITRE")
	private String titre;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	private Membres auteur;

	@Column
	private Categories categorie;
	
	@Column(name="CONTENUE")
	private String contenue;
	
	@OneToMany(cascade= {CascadeType.ALL})
	private List<Tags> tags;
	
	@Column(name="NOMBREVUES")
	private int nombreVues;
	
	@Column(name="CHAPEAU")
	private String chapeau;
	
	//getters et setters
	
	public String getChapeau() {
		return chapeau;
	}
	public void setChapeau(String chapeau) {
		this.chapeau = chapeau;
	}
	public List<Tags> getTags() {
		return tags;
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
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public List<Tags> getTag() {
		return tags;
	}
	public void setTag(List<Tags> tags) {
		this.tags = tags;
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
	
	public Articles(String titre, Membres auteur, Categories categorie, String contenue, String chapeau, List<Tags> tags,int nombreVues) {
		super();
		this.titre = titre;
		this.categorie = categorie;
		this.contenue = contenue;
		this.chapeau = chapeau;
		this.tags = tags;
		this.nombreVues=nombreVues;
		this.auteur=auteur;
	}
	
	
	
}
