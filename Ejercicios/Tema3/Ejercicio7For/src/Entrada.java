import java.util.Scanner;

public class Entrada {
    /*
    Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad
    de ceros (NumerosTipos)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int cantidadCeros = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;


        for (int i = 1; i < 11; i++) {
            System.out.println("Ingrese el numero " + (i) + ":");
            double numero = scanner.nextDouble();

            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            }else {
                cantidadCeros++;
            }
        }
        double mediaPositivos = cantidadPositivos > 0 ? sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = cantidadNegativos > 0 ? sumaNegativos / cantidadNegativos : 0;

        System.out.println("Media de los numero positivos: "+mediaPositivos);
        System.out.println("Media de los numero negativos: "+mediaNegativos);
        System.out.println("Cantidad de ceros: "+cantidadCeros);
        scanner.close();
    }
}
