import java.util.Scanner;

public class Entrada {
    /*
    * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura de la L: ");
        Abecedario abecedario = new Abecedario();
        abecedario.setAltura(scanner.nextInt());
        abecedario.pintarLetraL();

    }
}
