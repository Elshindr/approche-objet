package fr.diginamic.essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// Classe
		Cercle crcl_1 = new Cercle(234);
		Cercle crcl_2 = new Cercle(5);
		
		System.out.println("Perimetre= " + crcl_1.perimetre() +" Surface="+ crcl_1.surface());
		System.out.println("Perimetre= " + crcl_2.perimetre() +" Surface="+ crcl_2.surface());
		
		
		// Factory
		Cercle crcl_3 =	CercleFactory.factory(123);
		Cercle crcl_4 =	CercleFactory.factory(2);
		
		System.out.println("Perimetre= " + crcl_3.perimetre() +" Surface="+ crcl_3.surface());
		System.out.println("Perimetre= " + crcl_4.perimetre() +" Surface="+ crcl_4.surface());
	}

}
