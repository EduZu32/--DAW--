import model.Estudiante;

import java.io.IOException;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        //Estudiante estudiante1 = new Estudiante("Borja", 4,6,3);
        //Estudiante estudiante2 = new Estudiante("Juan", 2,7,9);
        ArrayList<Estudiante> listaEstudiante = null;

        try {
           listaEstudiante = Estudiante.leerEstudiante("src/resources/estudiantes.txt");
        } catch (IOException e) {
            System.out.println("El fichero no se enconetra");
        }

        //listaEstudiante.add(estudiante1);
        //listaEstudiante.add(estudiante2);

        for ( Estudiante estudiante :  listaEstudiante) {
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getNota1());
            System.out.println(estudiante.getNota2());
            System.out.println(estudiante.getNota3());
            estudiante.cacularMedia();
        }
    }



}
