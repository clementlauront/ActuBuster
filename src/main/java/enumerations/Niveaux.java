package enumerations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum Niveaux {
	
	ADMIN(0,"Admin"),
	JOURNALISTE(1,"Journaliste"),
	CLIENT(2,"Client");
	
	private int id;

	private String description;
	
	/*
	 * ==========
	 * Getters et Setters
	 * ==========
	 */
	public int getId() {
		return id;
	}

	public void setNiveau(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	/*
	 * ===========
	 * Constructeur
	 * ===========
	 */
	private Niveaux(int id, String description) {
		this.id = id;
		this.description = description;
	}

	
	
	
	
	

}
