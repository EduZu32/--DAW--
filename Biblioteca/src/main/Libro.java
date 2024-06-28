package main;

import java.io.Serializable;

public abstract class Libro implements Serializable {

    protected String autor;
    protected int numeroPaginas;
    protected String ISBN;

    //Constructor
    public Libro() {}
    public Libro(String autor, int numeroPaginas, String ISBN) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.ISBN = ISBN;
    }
    public abstract void mostrarInformacion();

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}


