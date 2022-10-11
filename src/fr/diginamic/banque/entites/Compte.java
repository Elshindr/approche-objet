package fr.diginamic.banque.entites;

public class Compte {
	int numCompte;
	double soldeCompte;

	public Compte(int numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public String toString() {
		return "Ton compte" + this.numCompte + " contient " + this.soldeCompte + "flouz";
	}
}
