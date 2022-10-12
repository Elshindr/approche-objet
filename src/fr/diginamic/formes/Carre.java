package fr.diginamic.formes;

public class Carre extends Rectangle {
	
	private double longueur;
	
	public Carre(double longueur) {
		super(longueur);
		this.longueur = longueur;
	}
	
	@Override
	public double calculerSurface() {
		return this.longueur * this.longueur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*(this.longueur + this.longueur);
	}
	
	// Getter & Setter
	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
