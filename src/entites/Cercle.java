package entites;
import static java.lang.Math.PI;

public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		return PI * this.rayon * 2;
	}

	public double surface() {
		return PI * this.rayon * this.rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
