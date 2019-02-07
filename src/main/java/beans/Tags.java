package beans;

public class Tags {

	private int id;
	private String tags;
	
	
	/*
	 * =========
	 * Getters et Setters
	 * =========
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	
	/*
	 * =========
	 * Constructeurs
	 * ========
	 */
	
	public Tags(int id, String tags) {
		super();
		this.id = id;
		this.tags = tags;
	}
}
