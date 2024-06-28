package model;

public class Profesor {
    private double notaExamenUno;
    private double notaExamenDos;
    private double media;

    public Profesor() {
    }

    public Profesor(double notaExamenUno, double notaExamenDos) {
        this.notaExamenUno = notaExamenUno;
        this.notaExamenDos = notaExamenDos;
    }

    public double calcularMedia(){
        notaExamenDos = ((media * 100) - (notaExamenUno * 40))/60;
        return notaExamenDos;
    }

    public double getNotaExamenUno() {
        return notaExamenUno;
    }

    public void setNotaExamenUno(double notaExamenUno) {
        this.notaExamenUno = notaExamenUno;
    }

    public double getNotaExamenDos() {
        return notaExamenDos;
    }

    public void setNotaExamenDos(double notaExamenDos) {
        this.notaExamenDos = notaExamenDos;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
