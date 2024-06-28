import java.util.Scanner;

public class Entrada {

    /*
    7. Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide
    con dicho número. Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no
    un número Armstrong. Se comprobará previamente que el número introducido tiene 3 dígitos.
    En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 3 dígitos”
    2. “Es un número Armstrong”
    3. “No es un número Armstrong”.
8. Leer tres enteros y mostrarlos ordenados.
    * */
    public static void main(String[] args) {
        System.out.println("Introduce un numero de 3 digitos para  verificar si es un numero Armstrong");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero >= 1 && numero < 1000){
            if (esArmstrong(numero)){
                System.out.println("Es un numero Armstrong");
            }else {
                System.out.println("No es un numero Armstrong");
            }
        }else{
            System.out.println("El numero no tiene 3  digitos");
        }


    }
    public static boolean esArmstrong(int numero){
        int original= numero;
        int suma = 0;

        while (numero != 0){
            int digito = numero % 10;
            suma += Math.pow(digito, 3);
            numero /= 10;
        }
        return original == suma;
    }
}
