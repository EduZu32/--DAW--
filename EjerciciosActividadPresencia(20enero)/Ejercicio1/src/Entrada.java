import model.Cono;

import java.util.Scanner;

public class Entrada {

    /*
    Escribe un programa que calcule el volumen de un cono según la fórmula V = (π * r^2 * h)/3
    Nota: para calcular r^2 podemos utilizar Math.pow(r, 2);
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cono cono = new Cono();
        Cono cono1 = new Cono(12,4);
        System.out.println("Introduce la altura del cono: ");
        cono.setConoAltura(scanner.nextDouble());

        System.out.println("Introduce el radio del cono: ");
        cono.setConoRadio(scanner.nextDouble());
        cono.mostrarDatos();
        System.out.println("**********************************************");
        cono1.mostrarDatos();





    }
}
