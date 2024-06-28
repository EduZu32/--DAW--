package main;

import java.util.List;

public class Policiaca extends Libro{

    private String trama;

    private List<String> personajes;

    public Policiaca() {}

    public Policiaca(String autor, int numeroPaginas, String ISBN, String trama, List<String> personajes) {
        super(autor, numeroPaginas, ISBN);
        this.trama = trama;
        this.personajes = personajes;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Genero del libro: Terror");
        System.out.println("Autor :" + autor);
        System.out.println("Numero de paginas: " +numeroPaginas);
        System.out.println("ISBN :"+ ISBN);
        System.out.println("Trama: "+ trama);
        System.out.println("Personajes: "+ personajes);
        System.out.println("*********************************************************************");
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public List<String> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<String> personajes) {
        this.personajes = personajes;
    }
}
