package fr.diginamic.salaire;

public abstract class Intervenant {
	private final String nom;
	private final String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	public abstract String getStatut();
	
	public void afficherDonnees() {
		System.out.println(this.nom + " " + this.prenom + " salaire: " + getSalaire() + " statut:" + getStatut());
	}
	
}
