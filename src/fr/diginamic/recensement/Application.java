package fr.diginamic.recensement;

import fr.diginamic.recensement.utils.Menu;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        if(Menu.fichier()){
            Menu.menu();
        }
        else{
            System.out.println("Fichier source non trouve");
        }
    }
}

