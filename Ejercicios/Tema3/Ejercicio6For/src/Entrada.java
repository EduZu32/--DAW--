import java.util.Scanner;

public class Entrada {
    /*
    *Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Los números pares entre " + num1 + " y " + num2 + " son:");

        // Asegurar que el primer número sea par si es impar
        if (num1 % 2 != 0) {
            num1++;
        }

        // Mostrar los números pares entre num1 y num2
        for (int i = num1; i <= num2; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
