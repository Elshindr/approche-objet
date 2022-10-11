package entites;

public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		// TODO Auto-generated method stub
		return 3.14 * this.rayon * 2;
	}

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
