package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresseP;
	
	
	/**
	 * Personne Constructor
	 * @param nom
	 * @param prenom
	 * @param adresseP
	 */
	public Personne(String nom, String prenom, AdressePostale adresseP) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseP = adresseP;
	}
	
	
	/**
	 * Afficher le nom et le prenom d'une personne
	 */
	public void afficherNomPrenom() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public void afficherAdresse() {
		System.out.println(adresseP.getNumRue() +" "+ adresseP.getLblRue() + "\n" + adresseP.getCodePostal() + " " +adresseP.getVille());
	}
	
	public void modifierNom(String nvNom) {
		this.nom = nvNom;
	}
	
	public void modifierPrenom(String nvPrenom) {
		this.prenom = nvPrenom;
	}
	
	public void modifierAdresse(AdressePostale nvAdresse) {
		this.adresseP = nvAdresse;
	}
	
	
	/**
	 * Getter sur nom
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getter sur prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Getter sur AdresseP
	 * @return adresseP
	 */
	public AdressePostale getAdresse() {
		return this.adresseP;
	}
}
