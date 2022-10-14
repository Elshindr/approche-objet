package fr.diginamic.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        int max = hSet.iterator().next().length();

        for(String str: hSet){
            if(max <  str.length()){
                max = str.length();
            }
            System.out.println(str);
        }

        System.out.println("MIN :::");
        Iterator<String> iterator = hSet.iterator();

        while(iterator.hasNext()){System.out.println("bb");
            String str = iterator.next();
            System.out.println(str);
            if(str.length() == max){
                iterator.remove();
            }
        }
        for(String str: hSet){
            System.out.println(str);
        }

    }
}
