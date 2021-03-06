package beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import enumerations.Niveaux;

@Entity
public class Membres {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="PRENOM")
		private String prenom;
		
		// CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE
		@OneToMany(cascade= {CascadeType.ALL}, mappedBy="auteur", orphanRemoval=false)
		private List<Articles> articles;
		
		@Column(name="NOM")
		private String nom;

		@Column(name="PSEUDO")
		private String pseudo;
		
		@Column(name="PASSWORD")
		private String password;
		
		@Column(name="EMAIL")
		private String email;
		
		@Column
		private Niveaux niveaux;
		
		
		/*
		 *========== 
		 * Getters et Setters
		 * =========
		 */
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<Articles> getArticles() {
			return articles;
		}
		public void setArticles(List<Articles> articles) {
			this.articles = articles;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPseudo() {
			return pseudo;
		}
		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Niveaux getNiveaux() {
			return niveaux;
		}
		public void setNiveaux(Niveaux niveaux) {
			this.niveaux = niveaux;
		}
		
		
		/*
		 * =========
		 * Constructeurs
		 * =========
		 */
		
		public Membres() {
			
		}
		
		public Membres(String prenom, String nom, String pseudo, String password, String email, Niveaux niveaux) {
			super();
			this.prenom = prenom;
			this.nom = nom;
			this.pseudo = pseudo;
			this.password = password;
			this.email = email;
			this.niveaux = niveaux;
		}
		@Override
		public String toString() {
			return pseudo;
		}
		
		
			

		/*
		 * ======
		 * Methodes 
		 * =====
		 */
		
}
