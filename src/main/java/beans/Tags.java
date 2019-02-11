package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tags {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="TAGS")
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
	
	public Tags( String tags) {
		super();
		this.tags = tags;
	}
}
