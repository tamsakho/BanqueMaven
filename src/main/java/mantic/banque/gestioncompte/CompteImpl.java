package mantic.banque.gestioncompte;

import java.util.ArrayList;
import java.util.List;

import mantic.banque.utils.BanqueUtils;

public class CompteImpl implements Compte{
	private List<Double> credits;
	private List<Double> debits;
	private double decouvert;
	private Personne titulaire;
	
	
	public CompteImpl() {
		super();
		credits = new ArrayList<>();
		debits = new ArrayList<>();
	}
	
	public CompteImpl(double decouvert) {
		this();
		this.decouvert = decouvert;
	}
	
	public CompteImpl(double decouvert, Personne titulaire) {
		this(decouvert);
		this.titulaire = titulaire;
	}
	
	public CompteImpl(Personne titulaire) {
		this.titulaire = titulaire;
	}

	public double getDecouvert() {
		return decouvert;
	}
	
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	private boolean verifDecouvert(double montant) {  
		return (getSolde() - montant >= -getDecouvert());
	}
	
	public void crediter(double montant){
		if(montant > 0){
			credits.add(montant);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void debiter(double montant){
		if(montant > 0){
			if(verifDecouvert(montant)){
				debits.add(montant);
			}			
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getSolde() {
		return BanqueUtils.calculSomme(credits) - BanqueUtils.calculSomme(debits);
	}

	public Personne getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Personne titulaire) {
		this.titulaire = titulaire;
	} 

}
