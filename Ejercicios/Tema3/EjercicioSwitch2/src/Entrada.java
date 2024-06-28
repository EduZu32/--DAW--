import java.util.Scanner;

public class Entrada {
    /*
    * Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante
    *  utilizando una sentencia switch.
    * */
    public static void main(String[] args) {
        System.out.println("Ingrese un caracter para determinar si es una vocal o una consonante:");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();

        switch (letra.toLowerCase()){
            case "a":
                System.out.println("El caracter ingresado es una vocal");
                break;
            case "e":
                System.out.println("El caracter ingresado es una vocal");
                break;
            case "i":
                System.out.println("El caracter ingresado es una vocal");
                break;
            case "o":
                System.out.println("El caracter ingresado es una vocal");
                break;
            case "u":
                System.out.println("El caracter ingresado es una vocal");
                break;
            default:
                System.out.println("El caracter ingresado es una consonante");

        }

    }
}
