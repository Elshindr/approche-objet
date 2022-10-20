package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] arrSaison = Saison.values();
        String nom = "ETE";
        String libelle = "Hiver";

        for (Saison saison: arrSaison) {
            System.out.println(saison.getNom());
        }

        System.out.println(Saison.valueOf(nom));

        Saison saison = Saison.getSaison(libelle);
        System.out.println(saison.getNom());
    }
}
