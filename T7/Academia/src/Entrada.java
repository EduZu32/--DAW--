import model.Alumno;
import model.Asignatura;
import model.Profesor;
import model.Universidad;

import java.util.ArrayList;
import java.util.Objects;

public class Entrada {


    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1);
        //calificacion 0
        Asignatura leguajeMarcas = new Asignatura(2);
        Asignatura sistemas = new Asignatura(3);
        Asignatura baseDatos = new Asignatura(4);
        Asignatura fol = new Asignatura(5);


        Alumno alumno1 = new Alumno("Juan",1,2,3, 4);
        Alumno alumno2 = new Alumno("Luis",4,5,6,1);
        Alumno alumno3 = new Alumno("Claudia",1,2,3,9);
        Alumno alumno4 = new Alumno("Eduard",new Asignatura(1),new Asignatura(2),new Asignatura(3),2);

        Universidad universidad=new Universidad();

        //cotratacion de 1 profesor nuevo
        universidad.contratarProfesor(new Profesor());


        //conjunto de alumnos[0]
        universidad.matricularAlumno(alumno1);
        //conjunto de alumnos[alumno1]
        universidad.matricularAlumno(alumno2);
        //conjunto de alumnos[alumno1,alumno2]
        universidad.matricularAlumno(alumno3);
        //conjunto de alumnos[alumno1,alumno2,alumno3]
        universidad.matricularAlumno(alumno4);
        //conjunto de alumnos[alumno1,alumno2,alumno3,alumno4]
        //calificar alumno que hay en la universidad
        universidad.calificacionAlumnos();
        //mostrar los datos de los alumnos ya una vez calificados
        universidad.ordenarporExpediente();
        universidad.mostrarAlumnos();
        universidad.mostrarAprobados();







        /*
        // array: es un conjunto de datos, los tipos tienen que tener algo en comun
        // no puedo hacerlo cerecer ni decrecer, se asocian a posiciones
        // int[] numeros = new int[]{1,23,435,56,47,47,47,3,2,3,655,};
        // Object[] cosas = new int[]{1,23,435,56,47,47,47,3,2,3,655,false,true,"adsaf", null, 'A'};

        //tengo n alumnos como califico a todos los alumnos -> arraylist
        // lista de datos que es dinamica, puede crecer y puede decrecer. se asocian a posiciones.
        //Si eliminamos un elemento que ha dentro del arraylist todos se mueven hacia izquierda.
        //hay que difinir siempre los arraylist y solo se hace datos de tipos complejos


        ArrayList<Integer> listaNumeros = new ArrayList();// [6,8,7,1]
        //añadir elementos
        listaNumeros.add(6);
        listaNumeros.add(8);
        listaNumeros.add(7);
        listaNumeros.add(1);
        //borrar elemento
        listaNumeros.remove(2); //borra el [7] porque borrar por indice [6,8,1]
        //listaNumeros.remove(7); // o me dices que elemento quieres borrar
        //obtener un elemento
        //listaNumeros.get(2);//[9]
        //recorrer el array con un foreache
        for ( Integer x : listaNumeros ) {
            System.out.println(x + " ");
        }

        //recorrer el array con un fori
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        listaNumeros.set(1,4); //cambias la sopicion 1 por el valor 4 [6,4,1]
        for ( Integer x : listaNumeros ) {
            System.out.print(x +" ");
        }

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno1);
        alumno1.mostrarDatos();
        alumno2.mostrarDatos();
        alumno3.mostrarDatos();

         */




    }
}
