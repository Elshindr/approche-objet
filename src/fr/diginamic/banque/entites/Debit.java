package fr.diginamic.banque.entites;


/**
 * Classe Debit
 * Herite de la Classe Abstract Operation
 * @author Elshindr
 *
 */
public class Debit extends Operation{

	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String getType() {
		return "DEBIT ::";
	}

}
