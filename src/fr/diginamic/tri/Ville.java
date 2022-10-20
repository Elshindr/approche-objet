package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type Ville.
 */
public class Ville implements Comparable<Ville>{
    /**
     * The Nom.
     */
    private String nom;
    /**
     * The Hab.
     */
    private int hab;

    /**
     * Instantiates a new Ville.
     *
     * @param nom the nom
     * @param hab the hab
     */
    public Ville(String nom, int hab) {
        this.nom = nom;
        this.hab = hab;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayList<Ville> arrVille = new ArrayList<>();
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

        // Tri avec comparator habitant
        System.out.println("\nPar Habitant ::");
        Collections.sort(arrVille, new ComparatorHabitant());
        for (Ville ville: arrVille){
            System.out.println(ville.getNom());
        }

        // Tri avec comparator nom
        System.out.println("\nPar Nom ::");
        Collections.sort(arrVille, new ComparatorNom());
        for (Ville ville: arrVille){
            System.out.println(ville.getNom());
        }

        // Tri sur la methode implémenté dans Ville
       /** Collections.sort(arrVille);
        for (Ville ville: arrVille){
            System.out.println(ville.getNom());
        }**/
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

    /**
     * Gets hab.
     *
     * @return the hab
     */
    public int getHab() {
        return hab;
    }

    /**
     * Sets hab.
     *
     * @param hab the hab
     */
    public void setHab(int hab) {
        this.hab = hab;
    }

    @Override
    public int compareTo(Ville o) {
        if (this.hab > o.getHab()){
            return 1;
        }
        if (this.hab < o.getHab()){
            return -1;
        }
        return 0;
    }
}

