import java.util.Scanner;

public class Ejercicio1 {
    /*
    * Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y
    * muestre el día de la semana correspondiente utilizando una sentencia switch.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero de 1 al 7");

        numero = teclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Es Lunes");
            break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            default:
                System.out.println("Es Domingo");
                break;
        }



    }
}
