package beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import enumerations.Categories;

@Entity
public class Quizz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="NOMBREVUES")
	private int nombreVues;
	
	@Column(name="TITRE")
	private String titre;
	
	@Column
	private Categories categorie;
	
	@OneToMany(cascade= {CascadeType.ALL})
	private List<Questions> questions;
	
	@Column(name="CONTENUE")
	private String contenue;
	
	@OneToMany(cascade= {CascadeType.ALL})
	private List<Reponses> reponse;
	
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
	public List<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public List<Reponses> getReponse() {
		return reponse;
	}
	public void setReponse(List<Reponses> reponse) {
		this.reponse = reponse;
	}
	
	/*
	 * =============
	 * Constructeurs
	 * ============
	 */
	public Quizz(int id, int nombreVues, String titre, Categories categorie, List<Questions> questions, String contenue,
			List<Reponses> reponse) {
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
