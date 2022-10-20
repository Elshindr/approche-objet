package fr.diginamic.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        Continent[] arrCont = Continent.values();
        List<Ville> lstVille = new ArrayList<>();

        Ville v_1 = new Ville("New York", 343000, Continent.AMERIQUE);
        Ville v_2 = new Ville("Paris", 47800, Continent.EUROPE);
        Ville v_3 = new Ville("Pékin", 53400,  Continent.ASIE);
        Ville v_4 = new Ville("Moscou", 484000,  Continent.EUROPE);
        Ville v_5 = new Ville("Berlin", 9700,  Continent.EUROPE);
        Ville v_6 = new Ville("Sydney", 77200,  Continent.OCEANIE);
        Ville v_7 = new Ville("Sao Paulo", 850700,  Continent.AMERIQUE);
        Ville v_8 = new Ville("Dakar", 40600,  Continent.AFRIQUE);
        lstVille.addAll(Arrays.asList(v_1, v_2, v_3, v_4, v_5, v_6, v_7, v_8));

        for (Ville ville : lstVille) {
            System.out.println(ville.toString());
        }
    }
}
