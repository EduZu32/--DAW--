import java.util.Scanner;

public class Entrada {
    /*

    Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje diferente para cada número
     utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un opcion de (1 al 4)");
        int opcion = scanner.nextInt();
        String opcionElegida;

        switch (opcion){
            case 1:
                opcionElegida = "Opcion 1";
                break;
            case 2:
                opcionElegida = "Opcion 2";
                break;
            case 3:
                opcionElegida = "Opcion 3";
                break;
            case 4:
                opcionElegida = "Opcion 4";
                break;
            default:
                System.out.println("Numero no compredido");
                return;

        }
        System.out.println(opcionElegida + " seleccionada.");
        scanner.close();
    }
}
