package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reponses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column (name="REPONSES")
	private String reponse;

	/*
	 * =========
	 * Getters et Setteurs
	 * =========
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReponses() {
		return reponse;
	}
	public void setReponses(String reponses) {
		this.reponse = reponses;
	}

	
	/*
	 * =============
	 * Constructeurs
	 * =============
	 */
	public Reponses(int id, String reponses) {
		super();
		this.id = id;
		this.reponse = reponses;
	}
	
	
	
	
}


