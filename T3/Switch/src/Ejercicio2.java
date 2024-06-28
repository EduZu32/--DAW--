import java.util.Scanner;

public class Ejercicio2 {
    /*
    * Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante
    * utilizando una sentencia switch.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;
        letra = teclado.nextLine();
        letra = letra.toLowerCase();
        switch (letra){
            case "a":
                System.out.println("Es consonante");
                break;
            case "e":
                System.out.println("Es consonante");
                break;
            case "i":
                System.out.println("Es consonante");
                break;
            case "o":
                System.out.println("Es consonante");
                break;
            case "u":
                System.out.println("Es consonante");
                break;
        }
    }
}
