import java.util.Scanner;

public class Ejercicio3 {
    /*
    * Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)*/
    public static void main(String[] args) {

        for (int numero = 0; numero <= 10 ; numero++) {
            System.out.println();
            System.out.println("Tabla de multiplicar del " + numero + ":");
            System.out.println("***************************");
            for (int i = 0; i <= 10 ; i++) {
                int multiplicacion = numero * i;
                System.out.println(numero +" x "+ i + " = "+ multiplicacion);
            }
        }


    }
}
