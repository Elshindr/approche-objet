package fr.diginamic.chaines;

public class TestStringBuilde {
    public static void main(String[] args) {
        // stringBuilder
        StringBuilder str = new StringBuilder();
        long debut = System.currentTimeMillis();


        for(int i = 0; i<100000; i++){
            str.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("temps écoulé: "+ (fin-debut));

        // +
        String concat = "";
        long debut_ = System.currentTimeMillis();


        for(int i = 0; i<100000; i++){
            concat += i;
        }
        long fin_ = System.currentTimeMillis();
        System.out.println("temps écoulé: "+ (fin_-debut_));
    }
}
