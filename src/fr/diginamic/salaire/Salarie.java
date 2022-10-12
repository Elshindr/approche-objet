package fr.diginamic.salaire;

/**
 *  Salarié en contrat de travail type CDI ou CDD
 * @author Elshindr
 *
 */
public class Salarie extends Intervenant {

	private double salaireMensuel;
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel * 30;
	}
	
	@Override
	public String getStatut() {
		return "Salarie";
	}
	
	/**
	 * @return the salaireMensuel
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	/**
	 * @param salaireMensuel the salaireMensuel to set
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
}
