package model;

public class Libro extends Multimedia {

    private String ISBN;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int identificador, String titulo, int tamano, String formato, String autor, String ISBN, int numeroPaginas) {
        super(identificador, titulo, tamano, formato, autor);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
