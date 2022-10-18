package fr.diginamic.recensement.utils;

import fr.diginamic.recensement.models.Recensement;
import fr.diginamic.recensement.models.Ville;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {
    private static Scanner scan;
    private static List<String> lines;

    public static void menu(){
        int menu = -1;
        scan = new Scanner(System.in).useDelimiter("\n");
        String name = "";
        try{
            do{
                System.out.println("\nMenu Recensement:\n1. Population d’une ville donnée\n2. Population d’un département donné\n3. Population d’une région donnée\n4. Afficher les 10 régions les plus peuplées\n5. Afficher les 10 départements les plus peuplés\n6. Afficher les 10 villes les plus peuplées d’un département\n7. Afficher les 10 villes les plus peuplées d’une région\n8. Afficher les 10 villes les plus peuplées de France\n9. Sortir");
                menu = scan.nextInt();

                if(menu >= 1 && menu <= 3){
                    System.out.println("Entrez un nom à rechercher");
                    name = scan.next();
                    Recensement.afficherPop(menu, name.toUpperCase());
                }
                else if(menu == 4 || menu == 5 || menu == 8){
                    Recensement.afficherTop10(menu, null);
                }
                else if(menu == 6 || menu == 7){
                    System.out.println("Entrez un nom à rechercher");
                    name = scan.next();
                    Recensement.afficherTop10(menu, name.toUpperCase());
                }

            } while(menu != 9);

        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Bye!");
        scan.close();
    }


    public static boolean fichier() throws IOException {
        Path path = Paths.get("C:/Users/Ydrani/Desktop/Diginamic/Java/7 - Approche Objet/J7 - TP/tp 16 - recensement population 2016.csv");

        if(Files.exists(path) && Files.isRegularFile(path) && Files.isReadable(path)){
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            for(int i = 1; i< lines.size(); i++){
                String[]  arrLine = lines.get(i).split(";");
                Ville ville = new Ville(arrLine[6].toUpperCase(), arrLine[5], arrLine[2], arrLine[0], arrLine[1].toUpperCase(), Integer.parseInt(arrLine[9].replace(" ","")));

                Recensement.getArrVille().add(ville);
            }
            return true;
        }

        return false;
    }
}
