import java.util.Scanner;

public class Ejercicio1 {

    /*
    *Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
    * Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas) */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leer el número de temperaturas a introducir
        System.out.println("Introduce el numero de temperaturas: ");
        int numTemperaturas = teclado.nextInt();

        // Establecer a 10 si el número es 0 o negativo
        if(numTemperaturas <=0){
            numTemperaturas = 10;
            System.out.println("Se eslableció el numero de temperaturas a 10.");

        }

        // Array para almacenar las temperaturas
        double [] temperaturas = new double [numTemperaturas];


        // Leer las temperaturas
        for (int i = 0; i < numTemperaturas; i++) {
            System.out.println("Introduce la temperatura " + (i +1) + ": ");
            temperaturas[i] = teclado.nextDouble();
        }

        // Calcular la media
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;

        }
        double media = suma /numTemperaturas;


        // Mostrar la media con dos decimales
        System.out.printf("La media de las temperaturas introducidas es: %.2f%n", media);

        teclado.close();

    }
}
