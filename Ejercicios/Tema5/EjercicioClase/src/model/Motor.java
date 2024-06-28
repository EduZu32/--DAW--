package model;

public class Motor extends Coche {
    private int cv;
    private int litrosAceite = 0;


    public Motor() {
    }

    public Motor(int cv) {
        this.cv = cv;
        litrosAceite = 0;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
}
