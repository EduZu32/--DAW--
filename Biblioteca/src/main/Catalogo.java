package main;



import java.io.IOException;
import java.util.List;

public interface Catalogo{

    void agregarLibro(Libro libro) throws CatalogoFullException;
    void sacarLibro(String ISBN) throws LibroNoEncontradoException;

    Libro buscarLibroPorISBN(String ISBN) throws LibroNoEncontradoException;
    int obtenerNumeroLibro();

    List<Libro> obtenerLibros();

    void exportarLibros(String nomArchivo) throws IOException;
}
