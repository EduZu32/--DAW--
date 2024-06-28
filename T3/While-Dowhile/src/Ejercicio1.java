import java.util.Scanner;

public class Ejercicio1 {
    /*
    *Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
        los números positivos. (SumarPositivos) */
    public static void main(String[] args) {
        //Ejemplo del While
       // int numero = 5;

        /*0 ejecucione o n ejecuciones (porque primero preguntamos y luego hacemos, no sabemos si cumplicara la condicion, por eso la 0 ejecuciones podemos asegurarlo)
        while(numero >= 0){
            System.out.println("Ejecutando el bloque while");
            numero--;
        }
        */

        //Ejemplo doWhile
        // 1 ejecucion (en este caso 1º hago luego pregunto asi que aseguramos 1 ejecucion)
        Scanner scaner = new Scanner(System.in);
        int opcion;
        do{//1º ejecutcion asegurada
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scaner.nextInt();
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:

                    break;
            }
        }while (opcion!=4); //preguntamos esta condicion para ver si salimos del bucle o no.
        System.out.println("La opcion elegida es: " +opcion);


    }
}
