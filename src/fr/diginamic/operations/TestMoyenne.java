package fr.diginamic.operations;

public class TestMoyenne {

	public static void main(String[] args) {
		//
		CalculMoyenne moy_1 = new CalculMoyenne();
		moy_1.ajout(12);
		moy_1.ajout(32);
		moy_1.ajout(34);
		moy_1.ajout(1);
		
		System.out.println(moy_1.calcul());
		
		//
		CalculMoyenne moy_2= new CalculMoyenne();
		moy_2.ajout(1);
		moy_2.ajout(1);
		moy_2.ajout(1);
		moy_2.ajout(1);
		
		System.out.println(moy_2.calcul());

	}

}
