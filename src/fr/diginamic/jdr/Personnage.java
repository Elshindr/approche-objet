package fr.diginamic.jdr;
/**
 * Classe Personnage
 * @author Elshindr
 *
 */
public class Personnage {
	
	private final int MAX_FORCE = 18;
	private final int MIN_FORCE = 12;
	private final int MAX_PV = 20;
	private final int MIN_PV = 50;
	
	private final int force;
	private int pointVie;
	private int score;
	

	/**
	 * Constructeur de la Classe Personnage
	 * @param force
	 * @param pointVie
	 * @param score
	 */
	public Personnage() {
		super();
		this.force = (int)((Math.random() * (MAX_FORCE - MIN_FORCE)) + MIN_FORCE);
		this.pointVie = (int)((Math.random() * (MAX_PV - MIN_PV)) + MIN_PV);
		this.score = 0;
	}
	
	
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}



	/**
	 * @return the pointVie
	 */
	public int getPointVie() {
		return pointVie;
	}


	/**
	 * @param pointVie the pointVie to set
	 */
	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}


	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
