package mantic.banque.utils;

import java.util.List;

public class BanqueUtils {
	
	public static double calculSomme(List<Double> liste){
		if(liste == null){
			return 0;
		}
		double somme=0;
		for(double montant : liste){
			somme+=montant;
		}
		return somme;
	}

}
