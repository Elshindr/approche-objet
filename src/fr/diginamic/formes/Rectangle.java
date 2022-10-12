package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	
	/**
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * 
	 * @param longueur
	 */
	public Rectangle(double longueur) {
		super();
		this.longueur = longueur;
	}

	
	@Override
	public double calculerSurface() {
		return this.largeur * this.longueur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*(this.largeur + this.longueur);
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

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}


}
