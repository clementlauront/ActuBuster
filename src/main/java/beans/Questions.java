package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column (name="QUESTION")
	private String question;
	
	/*
	 * ======
	 * Getters et Setters
	 * =======
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	/*
	 * ========
	 * Constructeurs
	 * ========
	 */
	public Questions(int id, String question) {
		super();
		this.id = id;
		this.question = question;
	}
	
	

}
