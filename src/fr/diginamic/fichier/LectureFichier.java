package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class LectureFichier {
    public static void main(String[] args) throws IOException {

        Path fileRenscmt = Paths.get("C:/Users/Ydrani/Desktop/Diginamic/Java/7 - Approche Objet/J5 & J6 - Collections et fichiers/TP/recensement.csv");
        Path pathVilles = Paths.get("C:/Users/Ydrani/Desktop/Diginamic/Java/7 - Approche Objet/J5 & J6 - Collections et fichiers/TP/villes.txt");

        if(!Files.exists(pathVilles)){
            Files.createFile(pathVilles);
        }

        List<Ville> arrVille = new ArrayList<>();
        List<String> arrSave = new ArrayList<>();

        if(Files.isReadable(pathVilles) && Files.exists(fileRenscmt) && Files.isRegularFile(fileRenscmt) && Files.isReadable(fileRenscmt)){
            List<String> lines = Files.readAllLines(fileRenscmt, StandardCharsets.UTF_8);

            for(int i = 1; i < lines.size(); i++){
                String[] arrline = lines.get(i).split(";");
                int size = Integer.parseInt(arrline[arrline.length -1].replace(" ",""));

                Ville ville = new Ville(arrline[6], arrline[0], arrline[1], size);
                arrVille.add(ville);

                if(size >= 25000){
                    arrSave.add(ville.getCode()+";" + ville.getNom()+";" + ville.getRegion()+";"+ville.getPop());
                }
            }

            Files.write(pathVilles, arrSave, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
    }
}
