package entites;

/**
 * Classe d' instanciation et de récupération de la Class Adresse Postale
 * @author Elshindr
 *
 */
public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale facturation = new AdressePostale();
		facturation.codePostal= "13456";
		facturation.lblRue = "allée des ananas";
		facturation.numRue = 23;
		facturation.ville="Nouméa";
		
		
		AdressePostale personnelle = new AdressePostale();
		personnelle.codePostal = "750000";
		personnelle.lblRue = "Rue de Jean Massiet";
		personnelle.numRue = 1234;
		personnelle.ville="Paris";
	}

}
