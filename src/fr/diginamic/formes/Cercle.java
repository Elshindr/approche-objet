package fr.diginamic.formes;

public class Cercle extends Forme{

	private double rayon;
	
	/**
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	@Override
	public double calculerSurface() {
		return 3.14 * this.rayon * this.rayon;
	}

	@Override
	public double calculerPerimetre() {

		return 3.14 * this.rayon * 2;
	}
	
	// Getter & Setter
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
