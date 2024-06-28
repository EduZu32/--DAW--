package model;

import controller.Aplicacion;

public class Garaje extends Aplicacion {
    private Coche coche;
    private String averiaAsociada;
    private int numeroCochesAtendidos;

    public Garaje() {
    }

    public Garaje(Coche coche, String averiaAsociada, int numeroCochesAtendidos) {
        this.coche = null;
        this.averiaAsociada = "";
        this.numeroCochesAtendidos = 0;
    }

    //Metodo para aceptar un coche en el garaje
    public boolean aceparCoche(Coche coche, String averiaAsociada) {
        if (this.coche == null) { //si no hay ningun coche en el garaje
            this.coche = coche;
            this.averiaAsociada = averiaAsociada;
            this.numeroCochesAtendidos++;
            return true;//se acepta el coche
        } else {
            return false;//ya hay un coche en el garaje;
        }
    }

    //Metodo para devolver un coche del garaje

    public void devolverCoche() {
        this.coche = null;
        this.averiaAsociada = "";
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public void setAveriaAsociada(String averiaAsociada) {
        this.averiaAsociada = averiaAsociada;
    }

    public int getNumeroCochesAtendidos() {
        return numeroCochesAtendidos;
    }

    public void setNumeroCochesAtendidos(int numeroCochesAtendidos) {
        this.numeroCochesAtendidos = numeroCochesAtendidos;
    }
}
