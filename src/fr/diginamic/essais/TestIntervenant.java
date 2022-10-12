package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("Jean", "Massiet", 234);
		Pigiste pigiste = new Pigiste("Maxime", "Robinet", 34, 234);
		
		System.out.println(salarie.getSalaire());
		System.out.println(pigiste.getSalaire());
		
		salarie.afficherDonnees();
		pigiste.afficherDonnees();

	}
}
