package controller;

import main.*;

import java.io.IOException;

public class Biblioteca{
    private String nombre, director;
    private Catalogo catalogo;

    public Biblioteca() {}

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.catalogo = null;
    }
    //Metodos



    public Libro buscarLibroCatalogo(String ISBN) throws LibroNoEncontradoException {
        if (catalogo == null){
            throw new RuntimeException("No existe un catalogo");
        }
        return catalogo.buscarLibroPorISBN(ISBN);
    }

    public void sacarLibroCatalogo(String ISBN) throws LibroNoEncontradoException{
        if(catalogo == null){
            throw new RuntimeException("No existe un catalogo");
        }
        catalogo.sacarLibro(ISBN);
    }

    public void exportarLibros(String nomArchivo) throws IOException{
        if (catalogo == null){
            throw new RuntimeException("No existe un catalogo");
        }
        catalogo.exportarLibros(nomArchivo);
    }

    public void agregarLibroCatalogo(Libro libro) throws CatalogoFullException {
        if (catalogo == null) {
            throw new RuntimeException("No existe un catalogo");
        }
        catalogo.agregarLibro(libro);
    }

    public Catalogo obtenerCatalogo(){
        return catalogo;
    }


    public void mostrarCatalogo(){
        if (catalogo != null){
            System.out.println("En el catalogo hay: "+ catalogo.obtenerNumeroLibro());
        }else {
            System.out.println("Hay que crear un catalogo primero");
        }
    }
    public void crearCatalogo(int capacidad) {
        this.catalogo = new CatalogoNormal(capacidad);
    }
}
