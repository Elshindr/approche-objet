package fr.diginamic.testenumeration;

/**
 * The enum Saison.
 */
public enum Saison {

    /**
     * Hivers saison.
     */
    HIVERS("Hiver", 4),

    /**
     * Printemps saison.
     */
    PRINTEMPS("Printemps", 1),

    /**
     * Ete saison.
     */
    ETE("Ete", 2),

    /**
     * Automne saison.
     */
    AUTOMNE("Automne", 3);

    /**
     * The Nom.
     */
    private String nom;

    private int ordre;

    /**
     * Instantiates a new Saison.
     *
     * @param nom the nom
     */
    Saison(String nom, int ordre){

        this.nom = nom;
        this.ordre = ordre;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public static Saison getSaison(String name){
        Saison[] arrSaison = Saison.values();

        for(Saison saison : arrSaison){
            System.out.println("test:: "+ saison.getNom());
            if(saison.getNom().equals(name)){
                return saison;
            }
        }

        return null;
    }
}
