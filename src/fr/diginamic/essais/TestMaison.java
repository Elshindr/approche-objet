package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Chambre chambre = new Chambre(23, 0);
		Cuisine cuisine = new Cuisine(34, 3);
		SalleDeBain sdb = new SalleDeBain(12, 3);
		Salon salon = new Salon(56, 1);
		Wc wc = new Wc(9, 3);
		
		Maison.ajouterPiece(chambre);
		Maison.ajouterPiece(cuisine);
		Maison.ajouterPiece(sdb);
		Maison.ajouterPiece(salon);
		Maison.ajouterPiece(wc);
		
		System.out.println("total" + Maison.getSuperficieTotal());
		System.out.println("Etage 0: " + Maison.getSuperficieEtage(0));
		System.out.println("Etage 1: " + Maison.getSuperficieEtage(1));
		System.out.println("Etage 2: " + Maison.getSuperficieEtage(2));
		System.out.println("Etage 3: " + Maison.getSuperficieEtage(3));
		System.out.println("Etage 4: " + Maison.getSuperficieEtage(4));
	}
}
