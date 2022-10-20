package fr.diginamic.recensement.models;

import java.util.*;

public class Recensement{
    private static List<Region> arrRegion;
    private static List<Departement> arrDep ;
    private static final List<Ville> arrVille = new ArrayList<>();
    private static List<Ville> arrVilleByRegion;
    private static List<Ville> arrVilleByDep;

    private static void concatDep(){
        arrDep = new ArrayList<>();
        List<String> lstDep = new ArrayList<>();

        for(Ville ville :arrVille){
            if(!lstDep.toString().contains(ville.getCodeD())){
                lstDep.add(ville.getCodeD());
                arrDep.add(new Departement(ville.getCodeD(), ville.getPop()));
            }
            else{
                for(Departement dep : arrDep){
                    if(dep.getCodeD().equals(ville.getCodeD())){
                        arrDep.get(arrDep.indexOf(dep)).setPop(arrDep.get(arrDep.indexOf(dep)).getPop() + ville.getPop());
                    }
                }
            }
        }

        Collections.sort(arrDep);
        Collections.reverse(arrDep);

        for(int i= 0; i<10; i++){
            System.out.println(arrDep.get(i).getCodeD() +" "+ arrDep.get(i).getPop());
        }

    }

    private static void concatRegion(){
        arrRegion = new ArrayList<>();
        List<String> lstRegion = new ArrayList<>();

        for(Ville ville :arrVille){

            if(!lstRegion.toString().contains(ville.getRegion())){
                lstRegion.add(ville.getRegion());
                arrRegion.add(new Region(ville.getRegion(), ville.getCodeR(), ville.getPop()));
            }
            else{
                for(Region reg : arrRegion){
                    if(reg.getRegion().equals(ville.getRegion())){
                        arrRegion.get(arrRegion.indexOf(reg)).setPop(arrRegion.get(arrRegion.indexOf(reg)).getPop() + ville.getPop());
                    }
                }
            }
        }

        Collections.sort(arrRegion);
        Collections.reverse(arrRegion);

        for(int i= 0; i<10; i++){
            System.out.println(arrRegion.get(i).getRegion() +" "+ arrRegion.get(i).getPop());
        }

    }

    private static void afficherTopByRegion(String region){
        arrVilleByRegion = new ArrayList<>();

        for(Ville ville : arrVille){
            if(ville.getRegion().equals(region)){
                arrVilleByRegion.add(ville);
            }
        }

        Collections.sort(arrVilleByRegion);
        Collections.reverse(arrVilleByRegion);

        if(arrVilleByRegion.size()>0){
            for(int i=0; i<10;i++){
                System.out.println(arrVilleByRegion.get(i).getCommune() +" " + arrVilleByRegion.get(i).getPop());
            }
        }

    }

    private static void afficherTopByDep(String codeDep){
        arrVilleByDep = new ArrayList<>();

        for(Ville ville : arrVille){
        if(ville.getCodeD().equals(codeDep)){
                arrVilleByDep.add(ville);
            }
        }

        Collections.sort(arrVilleByDep);
        Collections.reverse(arrVilleByDep);

        if(arrVilleByDep.size()>0){
            for(int i=0; i<10;i++){
                System.out.println(arrVilleByDep.get(i).getCommune() +" " + arrVilleByDep.get(i).getPop());
            }
        }
    }

    public static void afficherPop(int quoi, String name){
        int pop = 0;

        switch(quoi){
            case 1:
                for(Ville ville : Recensement.getArrVille()){
                    if(ville.getCommune().equals(name)){
                        pop = ville.getPop();
                        break;
                    }
                }
                break;
            case 2:
                for(Ville ville : Recensement.getArrVille()){
                    if(ville.getCodeD().equals(name)){
                        pop += ville.getPop();
                    }
                }
                break;
            case 3:
                for(Ville ville : Recensement.getArrVille()){
                    if(ville.getRegion().equals(name)){
                        pop += ville.getPop();
                    }
                }
                break;
            default:
                System.out.println("Type de population non trouvé");
                break;
        }

        if(pop == 0){
            System.out.println(name + "non trouvé");
        }
        else{
            System.out.println("La population de " + name + " est de : " + pop);
        }

    }

    public static void afficherTop10(int quoi, String name){
        switch(quoi){
            case 4:// top 10 régions
                concatRegion();
                break;
            case 5:// top 10 dep
                concatDep();
                break;
            case 6:// top 10 ville by dep
                afficherTopByDep(name);
                break;
            case 7: // top 10 ville by region
                afficherTopByRegion(name);
                break;
            case 8:// top 10 ville
                Collections.sort(arrVille);
                Collections.reverse(arrVille);

                for(int i=0; i<10;i++){
                    System.out.println(arrVille.get(i).getCommune()+ " " + arrVille.get(i).getPop());
                }
                break;

            default:
                System.out.println("Demande inconnue");
                break;
        }
    }


    public static List<Ville> getArrVille() {
        return arrVille;
    }
}
