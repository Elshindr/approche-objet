package fr.diginamic.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
   public static void main(String[] args) {
      HashSet<Double> hSet = new HashSet<>();
      hSet.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

      double max = 0;
      double min = hSet.iterator().next();

      for(Double unDouble : hSet){
         if(max < unDouble){
            max = unDouble;
         }
         if(min > unDouble){
            min = unDouble;
         }
         System.out.println(unDouble);
      }

      System.out.println("Max :: " +max);
      System.out.println("Min :: " +min);

      Iterator<Double> iterator = hSet.iterator();
      while(iterator.hasNext()){
         double unDouble = iterator.next();
         if(unDouble == min){
            hSet.remove(unDouble);
         }
      }

      for(Double unDouble : hSet){
         System.out.println(unDouble);
      }
   }
}
