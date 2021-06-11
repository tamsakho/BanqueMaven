package mantic.banque.gestioncompte;

public interface Compte {
	public void crediter(double montant);
	public void debiter(double montant);
	public double getSolde();

}
