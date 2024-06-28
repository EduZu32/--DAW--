import model.Profesor;

import java.util.Scanner;

public class Entrada {
    /*
    * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
    Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen
    cuenta el 40% y la del segundo examen un 60%.
    Nota: la nota final se calcularía como notaFinal = ((nota_examen1 * 40) + (nota_examen2 * 60)) / 100*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profesor profesor = new Profesor();

        System.out.println("Inroduce la nota del primer examen: ");
        profesor.setNotaExamenUno(scanner.nextFloat());
        //7
        System.out.println("¿Que nota quieres sacar en el tirmestre?");
        profesor.setMedia(scanner.nextFloat());
        //9
        System.out.println("Para tener un " + profesor.getMedia() + " en el trimestre necesitas sacar un "
                +profesor.calcularMedia() + " en el segundo examen.");


    }
}

