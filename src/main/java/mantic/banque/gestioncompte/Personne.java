package mantic.banque.gestioncompte;
import java.io.Serializable;

public class Personne implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom; 
	private String prenom; 
	private String telephone;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Personne(String nom, String prenom, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	public Personne() {
		super();
	} 
	
	
	
	

}