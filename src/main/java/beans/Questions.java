package beans;

public class Questions {
	
	private int id;
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
