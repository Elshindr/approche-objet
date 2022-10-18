package fr.diginamic.recensement.models;

import java.util.List;

public class Region implements Comparable<Region>{
    private String region;
    private String codeR;
    private int pop;
    private List<Ville> arrVille;

    public Region(String region, String codeR, int pop) {
        this.region = region;
        this.codeR = codeR;
        this.pop = pop;
        this.arrVille = arrVille;
    }

    @Override
    public int compareTo(Region o) {
        if (this.pop > o.getPop()){
            return 1;
        }
        if (this.pop  < o.getPop()){
            return -1;
        }
        return 0;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodeR() {
        return codeR;
    }

    public void setCodeR(String codeR) {
        this.codeR = codeR;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public List<Ville> getArrVille() {
        return arrVille;
    }

    public void setArrVille(List<Ville> arrVille) {
        this.arrVille = arrVille;
    }
}
