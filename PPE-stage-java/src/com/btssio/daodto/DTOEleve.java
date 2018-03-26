package com.btssio.daodto;

public class DTOEleve {

	// Private Arguments
	private Integer id;
	private String Nom;
	private String Prenom;
	
	// Getter
	public Integer getId() {
		return id;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	// Setter
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
		
}
