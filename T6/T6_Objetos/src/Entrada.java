import model.Aula;
import model.Usuario;

public class Entrada {

    public static void main(String[] args) {


        Usuario usuario1 = new Usuario();

        Usuario usuario2 = new Usuario("Eduard", "Ciprian", "12345678L");
        //nombre=Eduard, apellido=Ciprian, dni=12345678L, correo=null, pass=null,telefono =0, nacionalidad=null;
        usuario2.setPass("pasword1234");
        Usuario usuario3 = new Usuario("Borja", "Herrera", "98765432A");
        //nombre=Borja, apellido=Herrera, dni=98765432A, correo=null, pass=null,telefono =0, nacionalidad=null;

        Usuario usuario4 = new Usuario("David", "Manzano", "333445656A", "david@gmail.com", 69799033);
        //nombre=David, apellido=Manzano, dni=333445656A, correo=david@gmail.com, pass=null,telefono =69799033, nacionalidad=null;

        Usuario usuario5 = new Usuario("Sheila", "sheila@gmail.com");
        //nombre=Sheila, apellido=Herrera, dni=98765432A, correo=sheila@gmail.com, pass=null,telefono =0, nacionalidad=null;


        //imprimir su nombre
        /*System.out.println(usuario4.getNombre());
        usuario4.setNombre("Susana");
        System.out.println(usuario4.getNombre());

         */
        /*usuario4.saludar("Hola chicos, espero que nos enteremos de poo");
        */
        Aula aula = new Aula(usuario2,usuario3);
        aula.setUsuario2(usuario5);
        aula.mostrarDatosUsuarios();


        /*usuario2.saludar("Este tipo de  programacion es el que se utiliza en el ambiente profesional");
        usuario2.mostarDatos();
        usuario3.mostarDatos();

         */

    }

}
