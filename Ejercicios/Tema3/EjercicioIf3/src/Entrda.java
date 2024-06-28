import java.util.Scanner;

public class Entrda {
    /*
    4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o
     “Es bisiesto” o “No es bisiesto”,)

    El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.
    * */
    public static void main(String[] args) {
        System.out.println("Introduzca un año para verificar si es bisiestro o no:");
        Scanner scaner = new Scanner(System.in);
        int año = scaner.nextInt();
        int resultado = año / 4;

        if( resultado * 4 == año){
            System.out.println("El año es bisiestro");
        }else {
            System.out.println("El año no es bisiestro");
        }
        System.out.println("Hasta la proxima");


    }
}
