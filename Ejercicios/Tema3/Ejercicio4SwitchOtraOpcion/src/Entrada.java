import java.util.Scanner;

public class Entrada {
    /*
    *Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y muestre la cantidad
    * de días que tiene ese mes, considerando años no bisiestos
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero corespondiente a un mes de (1 al 12):");
        int mes = scanner.nextInt();

        int diasEnMes;

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasEnMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            case 2:
                diasEnMes =28;
                break;
            default:
                System.out.println("Numero del mes invalido");
                return;
        }
        System.out.println("El mes "+ mes + " tiene "+ diasEnMes +" dias");
        scanner.close();
    }
}
