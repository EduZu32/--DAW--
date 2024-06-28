import java.util.Scanner;

public class Entrada {
    /*
    *Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
    * */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para deterniar si es par o impar");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        switch (numero % 2){ // ingresamos el % para verificar que el resto de la divison sea 0 en el caso de los numeros pares
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
                System.out.println("El numero es impar");
                break;
            case -1:
                System.out.println("El numero es impar");
                break;
            default:
                System.out.println("El numero no es valido");
                break;
        }
    }
}
