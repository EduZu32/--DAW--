package model;

public class Multimedia {
    private int identificador, tamano;
    private String titulo, autor, formato;

    public Multimedia() {
    }

    public Multimedia(int identificador, String titulo, int tamano,String formato, String autor) {
        this.identificador = identificador;
        this.tamano = tamano;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTamaño() {
        return tamano;
    }

    public void setTamaño(int tamaño) {
        this.tamano = tamano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
