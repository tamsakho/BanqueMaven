package mantic.banque.gestioncompte;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author admin
 *
 */
public class Banque {
    private static Map<String,Compte> lesComptes; 
    private Requete requete;


	static { 
	    lesComptes = new HashMap<String,Compte>(); 
	    lesComptes.put("112222554485", new CompteImpl(new Personne("Dupond","Tafsir","0238000000"))); 
	    lesComptes.put("193333P", new CompteImpl(new Personne("Sauger","matthieu","0238000000"))); 
	  }; 
	
	public double getSolde(String numero){
		Compte compte = lesComptes.get(numero); 
		return compte.getSolde();
	}
	
	public void ajouterCompte(String numero, Personne titulaire) {		
		Banque.lesComptes.put(numero, new CompteImpl(titulaire));
		
	}
	
	/**
	 * Donne l'ensemble des personnes enregistrées en base
	 * @return ResultSet contenant les lignes retrouvées
	 */
	public ResultSet getPersonnesFromDB() {
		return requete.executer("SELECT * FROM personnes");		
	}
  
	public Requete getRequete() {
		return requete;
	}

	public void setRequete(Requete requete) {
		this.requete = requete;
	}

}
