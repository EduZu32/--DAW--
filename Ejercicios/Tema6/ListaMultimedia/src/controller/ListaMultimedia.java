package controller;

import model.Audio;
import model.Libro;
import model.Multimedia;
import model.Video;

import java.util.Scanner;

public class ListaMultimedia extends Multimedia {


    private Multimedia[] coleccion;
    private int contador;

    public ListaMultimedia() {
    }

    //Constructor
    public ListaMultimedia(int tamanoMaximo) {
        coleccion = new Multimedia[tamanoMaximo];
        contador = 0;
    }
    //Metodo para agregar un nuevo elemento

    public void agregarElemento(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que tipo de objeto desea añadir?");
        System.out.println("1.- Libro");
        System.out.println("2.- Video");
        System.out.println("3.- Audio");
        int opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                agregarLibro(scanner);
                break;
            case 2:
                agregarVideo(scanner);
                break;
            case 3:
                agregarAudio(scanner);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();
    }
    public void agregarLibro(Scanner scanner){
        System.out.println("Introduce el identificador de tipo numero: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor:");
        String autor = scanner.nextLine();

        System.out.println("Introduce el tamaño");
        int tamano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Introduce formato: ");
        String formato = scanner.nextLine();

        System.out.println("Introduce el ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.println("Introduce el numero de paginas: ");
        int numeroPaginas=scanner.nextInt();

        Libro libro = new Libro(identificador,titulo,tamano,formato, autor, ISBN, numeroPaginas);
        agregarElementoAColeccion(libro);
    }
    public void agregarVideo(Scanner scanner){
        System.out.println("Introduce el identificador: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor:");
        String autor = scanner.nextLine();

        System.out.println("Introduce el tamaño");
        int tamano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Introduce formato: ");
        String formato = scanner.nextLine();

        System.out.println("Introduce el director: ");
        String director = scanner.nextLine();

        System.out.println("Introduce los actores (separados por comas): ");
        String[] actores = scanner.nextLine().split(",");

        Video video = new Video(identificador,titulo,tamano,formato,autor,director,actores);
        agregarElementoAColeccion(video);
    }
    public void agregarAudio(Scanner scanner){
        System.out.println("Introduce el identificador:");
        int identificador = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Introduce el título:");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor:");
        String autor = scanner.nextLine();

        System.out.println("Introduce el tamaño:");
        int tamano = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Introduce el formato:");
        String formato = scanner.nextLine();

        System.out.println("Introduce la duracion: ");
        int duracion = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Introduce el soporte: ");
        String soporte = scanner.nextLine();

        Audio audio = new Audio(identificador,titulo,tamano, formato,autor,duracion,soporte);
        agregarElementoAColeccion(audio);

    }

    private void agregarElementoAColeccion(Multimedia elemento){
        if (contador <  coleccion.length){
            coleccion[contador] = elemento;
            contador++;
            System.out.println("Elemento añadido correctamente");
        }else{
            System.out.println("La coleccion esta llena. No se puede añadir mas elementos.");
        }
    }

    public void eleminarElemento(int identificador){
        int indice = buscarIndicePorIdentificador(identificador);
        if(indice != -1){
            for (int i = indice; i < contador - 1; i++) {
                coleccion[i] = coleccion[i + 1];
            }
            coleccion[contador -1]= null;
            contador--;
            System.out.println("Elemento eliminado corretamente.");
        }else{
            System.out.println("El indetificador no corresponde a ningun elemento de la configuracion");
        }
    }
    private  int buscarIndicePorIdentificador(int identificador){
        for (int i = 0; i < contador; i++) {
            if (coleccion[i].getIdentificador() == identificador){
                return i;
            }
        }
        return -1;
    }

    public void mostrarDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que tipo de elementos desea listar?");
        System.out.println("a.- Video");
        System.out.println("b.- Audio");
        System.out.println("c.- Todos");
        char opcion =scanner.nextLine().charAt(0);

        switch(opcion){
            case 'a':
                System.out.println("------------Videos--------------");
                listarVideos();
                break;
            case 'b':
                System.out.println("------------Audios--------------");
                listarAudios();
                break;
            case 'c':
                System.out.println("------------Todos los elementos--------------");
                listarTodos();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.close();
    }

    private void listarVideos(){
        for (int i = 0; i < contador; i++) {
            if (coleccion[i] instanceof Video){
                System.out.println(coleccion[i]);
            }
        }
    }
    private void listarAudios(){
        for (int i = 0; i < contador; i++) {
            if (coleccion[i] instanceof Audio){
                System.out.println(coleccion[i]);
            }
        }
    }
    private void listarTodos(){
        for (int i = 0; i < contador; i++) {
            System.out.println(coleccion[i]);
        }
    }


}
