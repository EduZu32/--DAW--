import controller.Biblioteca;
import main.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws CatalogoFullException {
        Scanner scanner = new Scanner(System.in);

       // 1.	Crea una biblioteca
        System.out.println("**********************************************");
        System.out.println("Ingrese un nombre para la Biblioteca");
        String nombreBiblioteca = scanner.nextLine();
        System.out.println("Ingreser un nombre para el Director");
        String nombreDirector = scanner.nextLine();
        System.out.println("**********************************************");
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca,nombreDirector);

        //2.	Crea un catálogo de 4 libros
        System.out.println("¿Que capacidad en numeros desea para su nuevo catalogo?");
        int capacidadCatalogo = scanner.nextInt();
        biblioteca.crearCatalogo(capacidadCatalogo);

        //3.    Menu

        while (true){
            System.out.println("****************************************************************");
            System.out.println("**********************( OPCIONES DE MENU )**********************");
            System.out.println("****************************************************************");
            System.out.println();
            System.out.println("1 -- Agregar libros indicando al catalogo: ");
            System.out.println();
            System.out.println("2 -- Aplica el  filtro de busqueda de libros por el ISBN: ");
            System.out.println();
            System.out.println("3 -- Mostrar todos los libros disponibles");
            System.out.println();
            System.out.println("4 -- Consultar al catalogo cuantos libros hay disponibles");
            System.out.println();
            System.out.println("5 -- Quitar libro del catalogo");
            System.out.println();
            System.out.println("6 -- Exportar los libros a un archivo");
            System.out.println();
            System.out.println("7 -- Salir de la Biblioteca");
            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("********************( INDIQUE SU OPCION )***********************");
            System.out.println("****************************************************************");
            System.out.println();

            int opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        agregarLibro(biblioteca, scanner);
                        break;
                    case 2:
                        buscarLibro(biblioteca, scanner);
                        break;
                    case 3:
                        monstarNumeroLibros(biblioteca, scanner);
                        break;
                    case 4:
                        mostrarLibros(biblioteca, scanner);
                        break;
                    case 5:
                        sacarLibro(biblioteca, scanner);
                        break;
                    case 6:
                        exportarLibros(biblioteca, scanner);
                        break;
                    case 7:
                        System.out.println(" Adios, hasta la proxima");
                        scanner.close();
                        return;
                    default:
                        System.out.println("La opcion elegina no esta compredida, introduzca un numero de 1 al 7");


                }

        }

    }



    private static void agregarLibro(Biblioteca biblioteca, Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el género del libro (TERROR, COMEDIA, ENSAYO, POLICIACA):");
        String generoString = scanner.nextLine().toUpperCase();
        GenLibro genero = GenLibro.valueOf(generoString);

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el número de páginas del libro:");
        int numeroPaginas = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el ISBN del libro:");
        String ISBN = scanner.nextLine();

        try {
            switch (genero) {
                case TERROR:
                    System.out.println("Ingrese la calificación del libro de terror:");
                    int calificacionTerror = scanner.nextInt();
                    biblioteca.agregarLibroCatalogo(new Terror(autor, numeroPaginas, ISBN, calificacionTerror));
                    break;
                case COMEDIA:
                    System.out.println("Ingrese el tipo de humor del libro de comedia:");
                    String tipoHumor = scanner.nextLine();
                    biblioteca.sacarLibroCatalogo(String.valueOf(new Comedia(autor, numeroPaginas, ISBN, tipoHumor)));
                    break;
                case POLICIACA:
                    System.out.println("Ingrese la trama del libro policiaco (MISTERIO o INTRIGA):");
                    String trama = scanner.nextLine().toUpperCase();
                    if (trama.equals("MISTERIO") || trama.equals("INTRIGA")) {
                        System.out.println("Ingrese los personajes del libro policiaco (separados por comas):");
                        String personajesString = scanner.nextLine();
                        List<String> personajes = Arrays.asList(personajesString.split(", "));
                        biblioteca.agregarLibroCatalogo(new Policiaca(autor, numeroPaginas, ISBN, trama, personajes));
                    } else {
                        System.out.println("Trama inválida. Debe ser 'MISTERIO' o 'INTRIGA'.");
                    }
                    break;
                default:
                    System.out.println("Género inválido.");
            }
        } catch (CatalogoFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LibroNoEncontradoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sacarLibro(Biblioteca biblioteca, Scanner scanner){
        scanner.nextLine();
        System.out.println("Ingrese el ISBN del libro que desea sacar del catalogo: ");
        String ISBN = scanner.nextLine();
        try{
            biblioteca.sacarLibroCatalogo(ISBN);
            System.out.println("Libro con ISBN "+ ISBN +" sacado del catalogo");
        }catch (LibroNoEncontradoException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }

    private static void buscarLibro(Biblioteca biblioteca, Scanner scanner){
        scanner.nextLine();
        System.out.println("Ingrese el ISBN del libro que desea buscar: ");
        String ISBN = scanner.nextLine();
        try{
            Libro libro = biblioteca.buscarLibroCatalogo(ISBN);
            libro.mostrarInformacion();
        }catch (LibroNoEncontradoException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }

    private static void mostrarLibros(Biblioteca biblioteca, Scanner scanner){
        try{
            for ( Libro libro : biblioteca.obtenerCatalogo().obtenerLibros() ) {
                libro.mostrarInformacion();
            }
        }catch (NullPointerException e){
            System.out.println("ERROR , Catalogo sin crear");
        }
    }

    private static void monstarNumeroLibros (Biblioteca biblioteca, Scanner scanner) {
        biblioteca.mostrarCatalogo();
    }

    private static void exportarLibros(Biblioteca biblioteca, Scanner scanner){
        scanner.nextLine();
        System.out.println("Ingrese el nombre del archvo que desea exportar");
        String nombreArchivo= scanner.nextLine();
        try{
            biblioteca.exportarLibros(nombreArchivo);
        }catch (IOException e){
            System.out.println("Error al Exportar los libros: "+ e.getMessage());
        }
    }

    
}

