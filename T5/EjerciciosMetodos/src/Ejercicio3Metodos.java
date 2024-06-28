import java.util.Scanner;

public class Ejercicio3Metodos {

    //crea un array y rellenar con 10 numeros por teclado? y mostralo normal inverso normal
    static int[] numeros = new int[10];

    public static void main(String[] args) {
        System.out.println("Ejercicio 3 con métodos");
        //llamar al metodo array ya esta relleno
        rellenarArray();
        //llamar al metodo mostramos el array por pantalla
        mostrarArray();
        //llamar al metodo mostramos el arrayInverso por pantalla
        mostrarInverso();
        mostrarArray();
    }

    //rellenar array
    public static void rellenarArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Indica numero");
            int numero = scanner.nextInt();
            numeros[i] = numero;

        }

    }

    //mostrar array
    public static void mostrarArray() {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }


    //mostrar array inverso
    public static void mostrarInverso() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

}
