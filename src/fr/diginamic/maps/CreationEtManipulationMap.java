package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

    //TODO Développements à réaliser ci-dessous
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.println("\nkey :::");
        Iterator<Integer> keysIte = mapVilles.keySet().iterator();
        while(keysIte.hasNext()){
            Integer key = keysIte.next();
            System.out.println(key);
        }

        System.out.println("\nvalues :::");
        Iterator<String> valueIte = mapVilles.values().iterator();

        while(valueIte.hasNext()){
            String value = valueIte.next();
            System.out.println(value);
        }

        System.out.println(mapVilles.size());
    }

}

