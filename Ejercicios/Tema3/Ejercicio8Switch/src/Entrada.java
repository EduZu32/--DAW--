import java.util.Scanner;

public class Entrada {
    /*
     * Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
     * y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un caracter que represente una operacion matematica (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        System.out.println("Ingrese el primer numero");
        double numeroUno = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        double numeroDos = scanner.nextInt();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = numeroUno + numeroDos;
                break;
            case '-':
                resultado = numeroUno - numeroDos;
                break;
            case '*':
                resultado = numeroUno * numeroDos;
                break;
            case '/':
                resultado = numeroUno / numeroDos;
                break;
            default:
                System.out.println("Operador invalido.");

        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }


}
