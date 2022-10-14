package fr.diginamic.maps;

import fr.diginamic.tri.Ville;
import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> hMap = new HashMap<>();
        Ville v_1 = new Ville("Nice", 343000);
        Ville v_2 = new Ville("Carcassonne", 47800);
        Ville v_3 = new Ville("Narbonne", 53400);
        Ville v_4 = new Ville("Lyon", 484000);
        Ville v_5 = new Ville("Foix", 9700);
        Ville v_6 = new Ville("Pau", 77200);
        Ville v_7 = new Ville("Marseille", 850700);
        Ville v_8 = new Ville("Tarbes", 40600);

        hMap.put(v_1.getNom(), v_1);
        hMap.put(v_2.getNom(),v_2);
        hMap.put(v_3.getNom(),v_3);
        hMap.put(v_4.getNom(),v_4);
        hMap.put(v_5.getNom(),v_5);
        hMap.put(v_6.getNom(),v_6);
        hMap.put(v_7.getNom(),v_7);
        hMap.put(v_8.getNom(),v_8);

        int min = hMap.get("Nice").getHab();
        Ville minVille = new Ville(null, 0);
        for(Ville ville : hMap.values()){
            if(min > ville.getHab()){
                min = ville.getHab();
                minVille = ville;
            }
        }

        hMap.remove(minVille.getNom());

        for(Ville ville : hMap.values()){
            System.out.println(ville.getNom());
        }
    }
}
