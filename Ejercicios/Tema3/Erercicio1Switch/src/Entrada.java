import java.util.Scanner;

public class Entrada {
    /*
    * Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de
    *  la semana correspondiente utilizando una sentencia switch.
    * */
    public static void main(String[] args) {
        System.out.println("Introduce un numero de 1 al 7");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero > 0 && numero < 8){
            switch (numero){
                case 1:
                    System.out.println("Es numero corresponde a lunes");
                    break;
                case 2:
                    System.out.println("Es numero corresponde a martes");
                    break;

                case 3:
                    System.out.println("Es numero corresponde a miercoles");
                    break;
                case 4:
                    System.out.println("Es numero corresponde a jueves");
                    break;
                case 5:
                    System.out.println("Es numero corresponde a viernes");
                    break;
                case 6:
                    System.out.println("Es numero corresponde a sabado");
                    break;
                case 7:
                    System.out.println("Es numero corresponde a domingo");
                    break;
            }
        }else {
            System.out.println("El numero no coresponde con ninguna opcion");
        }

    }
}
