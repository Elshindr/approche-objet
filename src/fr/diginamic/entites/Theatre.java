package fr.diginamic.entites;

public class Theatre {
	
	private final String nom;
	private final int maxCapacite;
	private int nbClient;
	private double recetteTotale;
	
	public Theatre(String nom, int maxCapacite, int nbClient, double recetteTotale) {
		super();
		this.nom = nom;
		this.maxCapacite = maxCapacite;
		this.nbClient = nbClient;
		this.recetteTotale = recetteTotale;
	}
	
	public void inscrire(int nbClient, double prix) {
		
		if(this.nbClient + nbClient < this.maxCapacite ) {
			this.nbClient += nbClient;
			this.recetteTotale += prix * nbClient;
			
			System.out.println("NbClient: " + this.nbClient + " Recette Actuelle:" + this.recetteTotale);
		}
		else {
			System.out.println("Capacité max atteinte");
		}
		
	}
	
	/**
	 * @return the nbClient
	 */
	public int getNbClient() {
		return nbClient;
	}

	/**
	 * @param nbClient the nbClient to set
	 */
	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}

	/**
	 * @return the recetteTotale
	 */
	public double getRecetteTotale() {
		return recetteTotale;
	}

	/**
	 * @param recetteTotale the recetteTotale to set
	 */
	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
}
