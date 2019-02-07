package beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import enumerations.Niveaux;

public class Membres {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="PRENOM")
		private String prenom;
		
		@Column(name="NOM")
		private String nom;
		
		@Column(name="PSEUDO")
		private String pseudo;
		
		@Column(name="PASSWORD")
		private String password;
		
		@Column(name="EMAIL")
		private String email;
		
		@OneToOne(cascade= {CascadeType.ALL})
		@JoinColumn
		private Niveaux niveaux;
		
		
		/*
		 *========== 
		 * Getters et Setters
		 * =========
		 */
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
		public Membres(String prenom, String nom, String pseudo, String password, String email, Niveaux niveaux) {
			super();
			this.prenom = prenom;
			this.nom = nom;
			this.pseudo = pseudo;
			this.password = password;
			this.email = email;
			this.niveaux = niveaux;
		}
			

		/*
		 * ======
		 * Methodes 
		 * =====
		 */
		
}
