package fr.diginamic.recensement.models;

public class Ville implements Comparable<Ville> {
    private String commune;
    private String region;
    private String codeC;
    private String codeD;
    private String codeR;
    private int pop;

    public Ville(String commune, String codeC, String codeD, String codeR, String region, int pop) {
        this.commune = commune;
        this.codeC = codeC;
        this.codeD = codeD;
        this.codeR = codeR;
        this.region = region;
        this.pop = pop;
    }

    @Override
    public int compareTo(Ville o) {
        if (this.pop > o.getPop()){
            return 1;
        }
        if (this.pop  < o.getPop()){
            return -1;
        }
        return 0;
    }

    public String getCodeR() {
        return codeR;
    }

    public void setCodeR(String code) {
        this.codeR = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getCodeC() {
        return codeC;
    }

    public void setCodeC(String codeC) {
        this.codeC = codeC;
    }

    public String getCodeD() {
        return codeD;
    }

    public void setCodeD(String codeD) {
        this.codeD = codeD;
    }
}
