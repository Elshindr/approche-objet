package fr.diginamic.jdr;

public class Creature {
	private final int MAX_FORCE ;
	private final int MIN_FORCE ;
	private final int MAX_PV;
	private final int MIN_PV;
	
	private int force;
	private int pointVie;
	private String type;
	
	public Creature(String type) {
		this.type = type;
		
		switch(type) {
			case "loup":
				MAX_FORCE = 8;
				MIN_FORCE = 3;
				MAX_PV = 10;
				MIN_PV = 5;
				break;
				
			case "gobelin":
				MAX_FORCE = 10;
				MIN_FORCE = 5;
				MAX_PV = 15;
				MIN_PV = 10;
				break;
				
			case "troll": 
				MAX_FORCE = 15;
				MIN_FORCE = 10;
				MAX_PV = 30;
				MIN_PV = 20;
				break;
				
			default: 
				MAX_FORCE = 0;
				MIN_FORCE = 0;
				MAX_PV = 0;
				MIN_PV = 0;
				break;
		}
		
		this.force = (int)((Math.random() * (MAX_FORCE - MIN_FORCE)) + MIN_FORCE);
		this.pointVie = (int)((Math.random() * (MAX_PV - MIN_PV)) + MIN_PV);
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
