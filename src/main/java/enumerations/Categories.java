package enumerations;

public enum Categories {

	GENERALE(0,"Générale"),
	CULTURE(1,"Culture"),
	SCIENCE(2,"Science"),
	TECHNOLOGIE(3,"Technologie"),
	SANTE(4,"Santé"),
	SOCIETE(5,"Société"),
	POLITIQUE(6,"Politique"),
	HISTOIRE(7,"Histoire"),
	FINANCE(8,"Finance"),
	JEUXVIDEO(9,"Jeux-video"),
	ECOLOGIE(10,"Ecologie");
	
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
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * ==========
	 * Constructeurs
	 * ==========
	 */
	
	private Categories(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
}
