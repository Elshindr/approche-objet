package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne monPote = new Personne();
		monPote.nom = "Jean";
		monPote.prenom="Massiet";
		monPote.adresseP.numRue= 33;
		monPote.adresseP.lblRue= "Avenue de la république";
		monPote.adresseP.ville= "Salon";
		monPote.adresseP.codePostal = "45555";
		
		Personne laSoeurDeMaPote = new Personne();
		monPote.nom = "Jeannette";
		monPote.prenom="Massiet";
		monPote.adresseP.numRue= 12343;
		monPote.adresseP.lblRue= "Avenue des balayettes";
		monPote.adresseP.ville= "Cabries";
		monPote.adresseP.codePostal = "20234";
		

	}

}
