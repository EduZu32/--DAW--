package main;


import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CatalogoNormal implements Catalogo{

    private List<Libro> libros;
    private int capacidad;

    public CatalogoNormal() {}

    public CatalogoNormal(int capacidad) {
        this.libros = new ArrayList<>();
        this.capacidad = capacidad;
    }
    @Override
    public void agregarLibro(Libro libro) throws CatalogoFullException{
        if (libros.size() >= capacidad){
            throw new CatalogoFullException("El catalogo se quedo sin espacio");
        }
        libros.add(libro);
    }

    @Override
    public void sacarLibro(String ISBN) throws LibroNoEncontradoException {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).ISBN.equals(ISBN)){
                libros.remove(i);
                return;
            }
        }
    }

    @Override
    public Libro buscarLibroPorISBN(String ISBN) throws LibroNoEncontradoException {
        for ( Libro libro : libros ) {
            if (libro.ISBN.equals(ISBN)){
                return libro;
            }
        }
        throw new LibroNoEncontradoException("El libro con el ISB :"+ ISBN +" no coincide con ninguno disponible");
    }

    @Override
    public int obtenerNumeroLibro() {
        return libros.size();
    }

    @Override
    public List<Libro> obtenerLibros() {
        return libros;
    }

    @Override
    public void exportarLibros(String nomArchivo) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomArchivo))) {
            objectOutputStream.writeObject(libros);
        }
        System.out.println("Libros exportados al archivo: " + nomArchivo);
    }
}
