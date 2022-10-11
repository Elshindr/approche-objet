package fr.diginamic.banque.entites;

/**
 * Classe Mere Operation
 * Classe Mere Abstraite
 * Fait hériter les Classes Debit et Credit
 */
public abstract class Operation {
	private String date;
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


	protected abstract String getType();

}
