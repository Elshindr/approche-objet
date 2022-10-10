package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale facturation = new AdressePostale(23, "allée des ananas","13456","Nouméa");
		AdressePostale personnelle = new AdressePostale(234, "Rue Jean Massiet", "12343", "londre");
		
		Personne monPote = new Personne("Jean","Massiet", facturation );
		Personne laSoeurDeMaPote = new Personne("Jeannette", "Massiet", facturation);
		
		monPote.afficherNomPrenom();
		monPote.afficherAdresse();	
		
		monPote.modifierAdresse(personnelle);
		monPote.afficherAdresse();	
	}

}
