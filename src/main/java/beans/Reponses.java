package beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Reponses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column (name="REPONSES")
	private String reponses;

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
		return reponses;
	}
	public void setReponses(String reponses) {
		this.reponses = reponses;
	}

	
	/*
	 * =============
	 * Constructeurs
	 * =============
	 */
	public Reponses(int id, String reponses) {
		super();
		this.id = id;
		this.reponses = reponses;
	}
	
	
	
	
}


