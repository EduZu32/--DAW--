import model.CalcularMCM;

import java.util.Scanner;

public class Entrada {
    /*
    * Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener el mcm se tomará uno de los valores
    * introducidos y se irá multiplicando por 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo del otro número,
    * que sería el valor buscado. (MinimoComunMultiplo)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entre 1 y 100:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero entre 1 y 100: ");
        int num2 = scanner.nextInt();
        CalcularMCM calcularMCM = new CalcularMCM();
        // Función para validar que el número esté en el rango [1, 100]
        System.out.println("El minimo comun multiplo (mcm) de " +num1+" y "+num2+ " es: "+ calcularMCM.clacularMCM(num1,num2));
        calcularMCM.validarNumero(num1);
        //Caculo del Minimo comun multiple desde un metodo importado
        calcularMCM.clacularMCM(num1,num2);





    }
}
