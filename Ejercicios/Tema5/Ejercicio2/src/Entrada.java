import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //Pedimos los datos por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Inroduzca apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Introduzca su dni: ");
        String dni = scanner.nextLine();

        System.out.println("Introduzca su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Introduzca su peso: ");
        double peso = scanner.nextInt();

        System.out.println("Introduzca su altura: ");
        int altura = scanner.nextInt();

        //Creamos a la persona con los datos introducidos opor teclado
        Persona persona = new Persona(nombre,apellido,dni,edad,altura,peso);
        persona.mostrarDatos();
        System.out.println("**********************************************");
        Persona persona1 = new Persona("Pedro","Pedro");
        persona1.mostrarDatos();
        System.out.println("**********************************************");
        Persona persona2 = new Persona();
        persona2.mostrarDatos();
        System.out.println("**********************************************");


        persona.modificarEdad(20);
        persona1.modificarEdad(20);
        persona2.modificarEdad(20);
        persona.mostrarDatos();
        System.out.println("**********************************************");
        persona1.mostrarDatos();
        System.out.println("**********************************************");
        persona2.mostrarDatos();
        System.out.println("**********************************************");



    }
}
