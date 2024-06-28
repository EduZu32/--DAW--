import java.util.Scanner;

public class Entrada {
    /*
    * Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos los números positivos.
    *  (SumarPositivos)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int sumaPositivos = 0;
        System.out.println("Introduzca un numero");
        numero=scanner.nextInt();

        while (numero != 0){
            if (numero > 0){
                sumaPositivos += numero;
            }
            System.out.println("Ingrese otro numero o (0 para finalizar)");
            numero= scanner.nextInt();
        }
        System.out.println("La suma de todos los numeros positivos ingresado es: "+ sumaPositivos);
        scanner.close();
    }
}
