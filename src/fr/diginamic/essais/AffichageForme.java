package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public abstract class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Perimetre : " + forme.calculerPerimetre() + " Surface: " + forme.calculerSurface());
	}
}
