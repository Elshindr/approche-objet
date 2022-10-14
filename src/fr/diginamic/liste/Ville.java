package fr.diginamic.liste;

import java.util.ArrayList;
import java.util.Iterator;

public class Ville {
    private String nom;
    private int hab;

    public Ville(String nom, int hab) {
        this.nom = nom;
        this.hab = hab;
    }

    public static void main(String[] args) {
        ArrayList<Ville> arrVille = new ArrayList();
        Ville v_1 = new Ville("Nice", 343000);
        Ville v_2 = new Ville("Carcassonne", 47800);
        Ville v_3 = new Ville("Narbonne", 53400);
        Ville v_4 = new Ville("Lyon", 484000);
        Ville v_5 = new Ville("Foix", 9700);
        Ville v_6 = new Ville("Pau", 77200);
        Ville v_7 = new Ville("Marseille", 850700);
        Ville v_8 = new Ville("Tarbes", 40600);

        arrVille.add(v_1);
        arrVille.add(v_2);
        arrVille.add(v_3);
        arrVille.add(v_4);
        arrVille.add(v_5);
        arrVille.add(v_6);
        arrVille.add(v_7);
        arrVille.add(v_8);

        int max = 0;
        for(Ville ville : arrVille){
            if(max < ville.getHab()){
                max = ville.getHab();
            }
        }
        System.out.println("MAX:: " + max);

        System.out.println("MIN::");
        int min = v_1.getHab();

        for(Ville ville : arrVille){
            if(min > ville.getHab()){
                min = ville.getHab();
            }
        }
        int finalMin = min;
        arrVille.removeIf(ville -> ville.getHab() == finalMin);

        for(Ville ville : arrVille){
            System.out.println(ville.getNom());
        }

        System.out.println("MAJ::");
        Iterator<Ville> iterator = arrVille.iterator();
        while(iterator.hasNext()) {
            Ville ville = iterator.next();
            if(ville.getHab() > 100000){
                ville.setNom(ville.getNom().toUpperCase());
            }
            arrVille.set(arrVille.indexOf(ville), ville);
        }

        for (Ville ville: arrVille){
            System.out.println(ville.getNom());
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
}
