package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {
        Map<String, Double> mapSalaires = new HashMap<>();

        mapSalaires.put("Paul", 17560d);
        mapSalaires.put("Hicham", 1825d);
        mapSalaires.put("Yu", 2250d);
        mapSalaires.put("Ingrid", 2015d);
        mapSalaires.put("Chantal", 2418d);

        System.out.println(mapSalaires.size());
    }
}
