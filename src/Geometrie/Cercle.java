package Geometrie;

public class Cercle implements ObjetGeometrique{
	
	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 3.14 * this.rayon * 2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 3.14 * this.rayon * this.rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
