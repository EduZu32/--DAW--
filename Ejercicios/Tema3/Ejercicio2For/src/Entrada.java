import java.util.Scanner;

public class Entrada {
    /*
    Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato: 5 x 3 = 15
    (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca  un numero entre 0 y 10:");
        int numero = scanner.nextInt();
        //Validar si el numero esta dentro del rango
        if (numero < 0 || numero > 10){
            System.out.println("El numero debe estar entre 0 y 10");
            return;
        }
        //Mostrar la tabla de multiplicar
        for (int i = 0; i < 10; i++) {
            int resultado = numero * i;
            System.out.println(numero +" x "+ i + " = "+ resultado);
        }

    }
}
