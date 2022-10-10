package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresseP;
	
	public Personne(String nom, String prenom, AdressePostale adresseP) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseP = adresseP;
	}
}
