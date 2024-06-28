import java.util.Scanner;

public class Ejercicio2 {
    /*
    * Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato:
    *  5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)*/
    public static void main(String[] args) {
        //Pedimos numeros por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres multiplicar: ");
        //Definimos la variable que cogera el valor metido por teclado
        int numero;
        numero = teclado.nextInt();
        //Recorremos de 0 hasta 10 y multiplicamos nuestro numero intriducido por el total de los numeros.
        for (int i = 0; i <11; i++) {

            int multiplcacion = i * numero;
            System.out.println(numero +" x "+ i + " = "+ multiplcacion);
        }
        //Cerramos el escaner
        teclado.close();

    }
}
