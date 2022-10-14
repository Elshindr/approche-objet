package fr.diginamic.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        Iterator<String> iterator_1 = arrStr.iterator();
        int max = 0;
        String maxStr = "";
        while(iterator_1.hasNext()){
            String str = iterator_1.next();
            if(max < str.length()){
                max = str.length();
                maxStr = str;
            }
        }
        System.out.println("max:: " + maxStr);

        System.out.println("UPPER:: " );
        Iterator<String> iterator_2 = arrStr.iterator();
        while(iterator_2.hasNext()) {
            String str = iterator_2.next();
            arrStr.set(arrStr.indexOf(str), str.toUpperCase());
        }

        for (String str: arrStr){
            System.out.println(str);
        }

        System.out.println("Sans N");
        Iterator<String> iterator_3 = arrStr.iterator();
        while(iterator_3.hasNext()){
            String str = iterator_3.next();
            if(str.startsWith("N")){
                iterator_3.remove();
            }
        }

        for(String str : arrStr){
            System.out.println(str);
        }
    }
}
