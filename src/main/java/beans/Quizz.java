package beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import enumerations.Categories;

public class Quizz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="NOMBREVUES")
	private int nombreVues;
	
	@Column(name="TITRE")
	private String titre;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn
	private Categories categorie;
	
	@OneToMany
	private Questions questions;
	
	@Column(name="CONTENUE")
	private String contenue;
	
	@OneToMany
	private Reponses reponse;
	
	/*
	 * ============
	 * Getters et Setters
	 * ===========
	 */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNombreVues() {
		return nombreVues;
	}
	public void setNombreVues(int nombreVues) {
		this.nombreVues = nombreVues;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Categories getCategorie() {
		return categorie;
	}
	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public Reponses getReponse() {
		return reponse;
	}
	public void setReponse(Reponses reponse) {
		this.reponse = reponse;
	}
	
	/*
	 * =============
	 * Constructeurs
	 * ============
	 */
	public Quizz(int id, int nombreVues, String titre, Categories categorie, Questions questions, String contenue,
			Reponses reponse) {
		super();
		this.id = id;
		this.nombreVues = nombreVues;
		this.titre = titre;
		this.categorie = categorie;
		this.questions = questions;
		this.contenue = contenue;
		this.reponse = reponse;
	}
	
	
}
