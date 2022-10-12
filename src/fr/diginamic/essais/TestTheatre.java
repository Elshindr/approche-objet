package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// 
		Theatre nvTheatre = new Theatre("Le grand super théatre", 24, 0, 23432);
		
		nvTheatre.inscrire(12, 122);
		nvTheatre.inscrire(4, 2);
		nvTheatre.inscrire(1, 342);
		nvTheatre.inscrire(5, 552);
		nvTheatre.inscrire(5, 552);
		
		System.out.println(nvTheatre.getNbClient());
		System.out.println(nvTheatre.getRecetteTotale());
	}

}
