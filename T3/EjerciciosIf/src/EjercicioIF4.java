import java.util.Scanner;

public class EjercicioIF4 {
    public static void main(String[] args) {
        /*
        *Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
        * En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)
        * El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.*/

        Scanner teclado = new Scanner(System.in);

        int año;

        System.out.println("Introduce el año que quieras saber Si es Bisiestro o NO");

        año = teclado.nextInt();
        if (año %4 == 0){
            System.out.println("Es Bisiestro");
        }else {
            System.out.println("No es Bisiestro");
        }


    }
}
