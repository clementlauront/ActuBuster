package enumerations;

public enum Niveaux {
	
	ADMIN(0,"Admin"),
	JOURNALISTE(1,"Journaliste"),
	CLIENT(2,"Client");
	
	private int niveau;
	private String nom;
	
	/*
	 * ==========
	 * Getters et Setters
	 * ==========
	 */
	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}	
	
	/*
	 * ===========
	 * Constructeur
	 * ===========
	 */
	private Niveaux(int niveau, String nom) {
		this.niveau = niveau;
		this.nom = nom;
	}

	
	
	
	
	

}
