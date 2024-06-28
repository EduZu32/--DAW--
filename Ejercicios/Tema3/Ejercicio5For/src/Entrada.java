import java.util.Scanner;

public class Entrada {
    /*
    * Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin
    * utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares:
    *  00 = Error y n0 = 1.(BaseExponente)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base (entre 0 y 5): ");
        int base = scanner.nextInt();

        System.out.println("Infrese el exponente (entre 0 y 5): ");
        int exponente = scanner.nextInt();

        //Validar que la bse y el exponente estan en el rango
        if ((base < 0 || base > 5) || (exponente < 0 || exponente >5)){
            System.out.println("La base y el exponente deben estar entre 0 y 5");
            return;
        }
        int resultado = 1;

        //Calcular la potencia
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        //Mostrar resultado
        System.out.println(base + "^" + exponente + " = " + resultado);
        scanner.close();
    }

}
