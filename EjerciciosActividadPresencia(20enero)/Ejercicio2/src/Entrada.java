import model.Reloj;

import java.util.Scanner;

public class Entrada {
    /*
    Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o
    buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
    Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reloj reloj = new Reloj();
        System.out.println("Introduce la hora en formato 24h, para saber a que saldo corresponde: ");
        reloj.setHora(scanner.nextInt());
        reloj.mostrarHora();
        scanner.close();
        System.out.println("****************************");
        Reloj reloj1 = new Reloj(22);
        reloj1.mostrarHora();
    }
}
