package fr.diginamic.set;

import java.util.Arrays;
import java.util.HashSet;

public class Pays {
    private String nom;
    private int hab;
    private double pib;

    public Pays(String nom, int hab, double pib) {
        this.nom = nom;
        this.hab = hab;
        this.pib = pib;
    }

    public static void main(String[] args) {
        HashSet<Pays> hSet = new HashSet<>();
        Pays p_1 = new Pays("USA", 343000, 12);
        Pays p_2 = new Pays("France", 47800, 3434);
        Pays p_3 = new Pays("Allemagne", 53400, 1212);
        Pays p_4 = new Pays("UK", 484000, 121.14);
        Pays p_5 = new Pays("Italie", 9700, 87.10);
        Pays p_6 = new Pays("Japon", 77200, 657);
        Pays p_7 = new Pays("Chine", 850700, 1334);
        Pays p_8 = new Pays("Russie", 40600,-875);
        Pays p_9 = new Pays("Inde", 40600, 3);
        hSet.addAll(Arrays.asList(p_1, p_2, p_3, p_4, p_5, p_6, p_7, p_8, p_9));

        double maxPib = 0;
        int maxHab = 0;
        double minPib = p_1.getPib();
        String strPib = "";
        String strHab = "";

        for(Pays pays : hSet){
            if(maxPib < pays.getPib()){
                maxPib = pays.getPib();
                strPib = pays.getNom();
            }
            if(minPib > pays.getPib()){
                minPib = pays.getPib();
            }
            if(maxHab < pays.getHab()){
                maxHab = pays.getHab();
                strHab = pays.getNom();
            }
        }
        System.out.println("Pays avec PIB max::"+ strPib  + " Pays avec nombre d'habitant max:: " + strHab);

        for(Pays pays : hSet){
            if(pays.getPib() == minPib){
                pays.setNom(pays.getNom().toUpperCase());
            }
        }
        for(Pays pays : hSet){
            System.out.println(pays.getNom());
        }

        double finalMinPib = minPib;
        hSet.removeIf(pays -> pays.getPib() == finalMinPib);

        System.out.println("End:: ");
        for(Pays pays : hSet){
            System.out.println(pays.getNom());
        }

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }
}
