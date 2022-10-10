package entites;

/**
 * 
 * Classe Représentant une adresse postale
 * @author Elshindr
 *
 */
public class AdressePostale {
	int numRue;
	String lblRue;
	String codePostal;
	String ville;

	
	public AdressePostale(int numRue, String lblRue, String codePostal, String ville) {
		this.numRue = numRue;
		this.lblRue = lblRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public int getNumRue() {
		return this.numRue;
	}
	
	public String getLblRue() {
		return this.lblRue;
	}
	
	public String getCodePostal() {
		return this.codePostal;
	}
	
	public String getVille() {
		return this.ville;
	}
}
