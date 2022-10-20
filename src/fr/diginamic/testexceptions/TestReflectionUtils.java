package fr.diginamic.testexceptions;

import fr.diginamic.liste.Continent;
import fr.diginamic.liste.Ville;

import javax.management.ReflectionException;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException,  fr.diginamic.testexceptions.ReflectionException {
        Ville ville = new Ville("Salon", 233134, Continent.EUROPE);

        ReflectionUtils.afficherAttributs(null);

    }
}
