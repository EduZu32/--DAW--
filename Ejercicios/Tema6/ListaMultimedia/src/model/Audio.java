package model;

import controller.ListaMultimedia;

public class Audio extends Multimedia{
    private int duracion;
    private String soporte;

    public Audio() {
    }

    public Audio(int identificador, String titulo, int tamano, String formato, String autor, int duracion, String soporte) {
        super(identificador, titulo, tamano, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
