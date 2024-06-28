import java.util.Scanner;

public class Entrada {
    /*
    Ejercicio 6:
Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        System.out.println("Introduzca números positivos. Introduzca un número negativo para terminar.");

        // Pedir números hasta que se introduzca uno negativo
        while (true) {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            // Verificar si el número es negativo para salir del bucle
            if (numero < 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        // Verificar si se introdujeron números positivos
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}



