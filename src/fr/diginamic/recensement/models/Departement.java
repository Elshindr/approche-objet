package fr.diginamic.recensement.models;

public class Departement implements Comparable<Departement>{
    private String codeD;
    private int pop;

    public Departement(String codeD, int pop) {
        this.codeD = codeD;
        this.pop = pop;
    }

    @Override
    public int compareTo(Departement o) {
        if (this.pop > o.getPop()){
            return 1;
        }
        if (this.pop  < o.getPop()){
            return -1;
        }
        return 0;
    }

    public String getCodeD() {
        return codeD;
    }

    public void setCodeD(String codeD) {
        this.codeD = codeD;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

}
