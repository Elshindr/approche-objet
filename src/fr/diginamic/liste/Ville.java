package fr.diginamic.liste;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The type Ville.
 */
public class Ville {
    /**
     * The Nom.
     */
    private String nom;
    /**
     * The Hab.
     */
    private int hab;
    /**
     * The Continent.
     */
    private Continent continent;


    /**
     * Instantiates a new Ville.
     *
     * @param nom       the nom
     * @param hab       the hab
     * @param continent the continent
     */
    public Ville(String nom, int hab, Continent continent) {
        this.nom = nom;
        this.hab = hab;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", hab=" + hab +
                ", continent=" + continent +
                '}';
    }


    @Override
    public boolean equals(Object o){
        if( !(o instanceof Ville)){
            return false;
        }

        if( o == null || this.getClass() != o.getClass()){
            return false;
        }

        Ville ville = (Ville) o;

        return ville.getHab() == this.getHab() && ville.getNom().equals(this.getNom());
    }

      /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return hab == ville.hab && nom.equals(ville.nom);
    }*/


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayList<Ville> arrVille = new ArrayList<>();
        Ville v_1 = new Ville("Nice", 343000, null);
        Ville v_2 = new Ville("Carcassonne", 47800, null);
        Ville v_3 = new Ville("Narbonne", 53400, null);
        Ville v_4 = new Ville("Lyon", 484000, null);
        Ville v_5 = new Ville("Foix", 9700, null);
        Ville v_6 = new Ville("Pau", 77200, null);
        Ville v_7 = new Ville("Marseille", 850700, null);
        Ville v_8 = new Ville("Tarbes", 40600, null);

        arrVille.add(v_1);
        arrVille.add(v_2);
        arrVille.add(v_3);
        arrVille.add(v_4);
        arrVille.add(v_5);
        arrVille.add(v_6);
        arrVille.add(v_7);
        arrVille.add(v_8);

        int max = 0;
        int min = v_1.getHab();

        for(Ville ville : arrVille){
            if(max < ville.getHab()){
                max = ville.getHab();
            }
            if(min > ville.getHab()){
                min = ville.getHab();
            }
        }
        System.out.println("MAX:: " + max);

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

        // Egalite d'instance
        Ville ville_1 = new Ville("nice", 12312, null);
        Ville ville_2 = new Ville("nice", 12312, null);

        System.out.println("test egalité: " + ville_1.equals(ville_2));
        if( ville_1 == ville_2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        ville_2.setNom("Aix");
        System.out.println("test egalité: " + ville_1.equals(ville_2));
        if( ville_1 == ville_2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
