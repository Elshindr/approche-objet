package fr.diginamic.banque.entites;
/**
 * Classe Credit
 * Herite de la Classe Abstraite Operation
 * @author Elshindr
 *
 */
public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "CREDIT ::";
	}
}
