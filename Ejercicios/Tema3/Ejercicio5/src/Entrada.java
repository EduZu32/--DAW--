import java.util.Scanner;

public class Entrada {
    /*
    5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente
     que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un numero de 4 digitos para comprobar si es capicua:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero >= 1000 && numero <= 9999){// quitar numeros menores de 4 digitos
            if (esCapicua(numero)){
                System.out.println("Es Capicua");
            }else {
                System.out.println("No es Capicua");
            }
        }else{
            System.out.println("El numero introducido no tiene los 4 digitos");
        }
    }
    public static boolean esCapicua(int numero){
        int original = numero;
        int reverso = 0;
        while (numero != 0){
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        return original == reverso;
    }

}
