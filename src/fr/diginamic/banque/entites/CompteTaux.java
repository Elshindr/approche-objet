package fr.diginamic.banque.entites;

/**
 * Compte rémunéré
 * Hérite de la Classe Compte
 * @author Elshindr
 *
 */
public class CompteTaux extends Compte{

	double tauxRemumeration;
	
	public CompteTaux(int numCompte, double soldeCompte, double tauxRemumeration) {
		super(numCompte, soldeCompte);
		// TODO Auto-generated constructor stub
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
		this.tauxRemumeration = tauxRemumeration;
		
	}
	
	public String toString() {
		return super.toString() + " avec un taux de "+this.tauxRemumeration;
	}
	

}
