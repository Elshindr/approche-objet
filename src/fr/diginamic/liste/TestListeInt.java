package fr.diginamic.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        for(Integer i : arrInt){
            System.out.println(i);
        }

        System.out.println("taille"+arrInt.size());
        System.out.println("max"+arrInt.stream().max(Integer::compare).get());

        System.out.println("sans min");
        arrInt.remove(arrInt.stream().min(Integer::compare).get());
        for(Integer i : arrInt){
            System.out.println(i);
        }

        System.out.println("end");
        Iterator<Integer> iterator = arrInt.iterator();

        while(iterator.hasNext()){
            int i = iterator.next();
            if(i < 0){
                arrInt.set(arrInt.indexOf(i), i*(-1));
            }
        }

        for(Integer i : arrInt){
            System.out.println(i);
        }
    }
}
