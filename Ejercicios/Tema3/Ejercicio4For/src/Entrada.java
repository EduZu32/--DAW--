import java.util.Scanner;

public class Entrada {
    /*
     * Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros comprendidos en un rango
     * de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero incial del rango: ");
        int inicio = scanner.nextInt();
        System.out.println("Introduzca el numero final del rango: ");
        int fin = scanner.nextInt();

        //validar que el inciio y el fin del rango que sean validos
        if(inicio <0 || inicio > 10 || fin < 0 || fin > 10 || inicio > fin){
            System.out.println("Los numeros del rango deben ser entre 0 y 10, el inicio debe ser menor o igual al numero fin");
            return;
        }


        //Calcular y mosttrar las tablas de multiplicar
        for (int numero = inicio; numero <= fin; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 0; i < 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            System.out.println();
        }
        scanner.close();

    }
}
