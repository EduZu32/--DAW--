import java.util.Scanner;

public class Entrada {
    /*
    Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10). Obténgase la media con
     dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduce el numero de temperaturas a introducir: ");
        int numTemperaturas = scanner.nextInt();

        if (numTemperaturas <= 0){
            numTemperaturas = 10;
        }
        double sumaTemperaturas = 0;

        for (int i = 1; i <= numTemperaturas ; i++) {
            System.out.println("Introduce la temperatura " + i + ": ");
            double temperatura = scanner.nextDouble();
            sumaTemperaturas += temperatura;

        }
        double media = sumaTemperaturas / numTemperaturas;

        System.out.println("La media de las temperaturas introducidas es : " + media);
    }
}
