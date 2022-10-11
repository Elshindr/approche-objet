package Geometrie;

public class Rectangle implements ObjetGeometrique{

	private int longueur;
	private int largeur;
	
	public Rectangle(int longueur, int largeur) {
		super();
		this.setLongueur(longueur);
		this.setLargeur(largeur);
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*(this.largeur + this.longueur);
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.largeur * this.longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}
