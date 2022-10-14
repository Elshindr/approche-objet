package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        if (o1.getHab() > o2.getHab()){
            return 1;
        }
        if (o1.getHab()< o2.getHab()){
            return -1;
        }
        return 0;
    }
}
