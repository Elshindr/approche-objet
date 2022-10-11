package fr.diginamic.utils;

import entites.Cercle;

public class CercleFactory {

	public static Cercle factory(double rayon) {
		
		Cercle cercle = new Cercle(rayon);
		
		return cercle;
	}
}
