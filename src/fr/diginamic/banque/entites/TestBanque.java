package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		//
		Compte nvCompte = new Compte(234431, 123413.94);
		System.out.println(nvCompte);// la methode toString réécrite est appellée
		
		
		//
		Compte[] arrComptes = new Compte[2];
		
		
		arrComptes[0] = nvCompte;
		
		CompteTaux nvCompteTaux = new CompteTaux(12345, 12356.94, (double)12.99);
		arrComptes[1] = (Compte) nvCompteTaux;
		
		for(Compte i : arrComptes) {
			System.out.println(i);
		}

	}

}
