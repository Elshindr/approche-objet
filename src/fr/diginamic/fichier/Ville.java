package fr.diginamic.fichier;

public class Ville {
    private String nom;
    private String code;
    private String region;
    private int pop;

    public Ville(String nom, String code, String region, int pop) {
        this.nom = nom;
        this.code = code;
        this.region = region;
        this.pop = pop;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
