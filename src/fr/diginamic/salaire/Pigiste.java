package fr.diginamic.salaire;

/**
 * personnes payées à la journée
 * @author Elshindr
 *
 */
public class Pigiste extends Intervenant {
	
	private int nbJrTravail;
	private double montantJr;
	
	public Pigiste(String nom, String prenom, int nbJrTravail, double montantJr) {
		super(nom, prenom);
		this.nbJrTravail = nbJrTravail;
		this.montantJr = montantJr;
	}

	@Override
	public double getSalaire() {
		return nbJrTravail * montantJr;
	}
	
	@Override
	public String getStatut() {
		return "Pigiste";
	}
	
	
	/**
	 * @return the nbJrTravail
	 */
	public int getNbJrTravail() {
		return nbJrTravail;
	}

	/**
	 * @param nbJrTravail the nbJrTravail to set
	 */
	public void setNbJrTravail(int nbJrTravail) {
		this.nbJrTravail = nbJrTravail;
	}

	/**
	 * @return the montantJr
	 */
	public double getMontantJr() {
		return montantJr;
	}

	/**
	 * @param montantJr the montantJr to set
	 */
	public void setMontantJr(double montantJr) {
		this.montantJr = montantJr;
	}
}
