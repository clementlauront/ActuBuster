package beans;

import enumerations.Niveaux;

public class Articles {

	private String prenom;
	private String nom;
	private String pseudo;
	private String password;
	private String email;
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
	public Articles(String prenom, String nom, String pseudo, String password, String email, Niveaux niveaux) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.pseudo = pseudo;
		this.password = password;
		this.email = email;
		this.niveaux = niveaux;
	}
}
