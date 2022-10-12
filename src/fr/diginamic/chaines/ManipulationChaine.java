package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// 
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur: " + chaine.length());
		System.out.println("Index du premier « ; »: " + chaine.indexOf(';'));
		System.out.println("Extraire le nom de famille: " + chaine.substring(0, chaine.indexOf(';')));
		System.out.println("Upper le nom de famille: " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());
		System.out.println("Lower le nom de famille: " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		
		String[] arrChaine = chaine.split(";");
		
		for(String i : arrChaine) {
			System.out.print(i+" ");
		}
		
		String nom = arrChaine[0];
		String prenom = arrChaine[1];
		String  strSalaire = arrChaine[2];
		double salaire = Double.parseDouble(strSalaire.replace(" ", ""));
		Salarie nvSalarie = new Salarie(nom, prenom, salaire);
	}

}
