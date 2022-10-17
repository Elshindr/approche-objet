package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws IOException {
        File fileNew = new File("C:/Users/Ydrani/Desktop/Diginamic/Java/7 - Approche Objet/J5 & J6 - Collections et fichiers/TP/diginamic.txt");

        if(!fileNew.createNewFile()){
            System.out.println("Creation Failed");
        }

        Path fileRecensemt = Paths.get("C:/Temp/Java/7 - Approche Objet/J5 & J6 - Collections et fichiers/TP/recensement.csv");

        if(Files.exists(fileRecensemt) && Files.isRegularFile(fileRecensemt) && Files.isReadable(fileRecensemt)){
            List<String> lines = Files.readAllLines(fileRecensemt, StandardCharsets.UTF_8);
            List<String> copy =  new ArrayList<>();
            for(int i = 0; i < 100; i++){
                copy.add(lines.get(i));
            }
            Path pathNew = Paths.get("C:/Temp/Java/7 - Approche Objet/J5 & J6 - Collections et fichiers/TP/diginamic.txt");
            Files.write(pathNew, copy,StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
    }
}
