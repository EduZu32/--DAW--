package model;

import controller.ListaMultimedia;

public class Video extends Multimedia {
    private String director;
    private String[] actores;

    public Video() {
    }

    public Video(int identificador, String titulo, int tamano, String formato, String autor, String director, String[] actores) {
        super(identificador, titulo, tamano, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }
}
