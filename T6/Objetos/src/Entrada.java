import model.Usuario;
import model.Aula;

public class Entrada {
    public static void main(String[] args) {
        //primitiva -> ocupa poca memoria solo guarda un dato.
        int numero = 2;
        //Compleja -> objeto -> ocupa mas merio -> dato y ejecuciones que puede hacer.
        String nombre = "Eduard";

        //Crear mis proprias variables/objetos.Dento de src creamos un nuevo Package y sirve para guardar los modelos de datos.
        //esto ya es un usuario porque lo hemos istanciado/construiendo con la palabra reservada new
        //Hemos construido el objeto
        //Construir usuario sin datos porque tenemos un constructor sin parametros creado, OBLIGATORIO UNO VACIO.
        Usuario usuario3 = new Usuario();
        Usuario usuario1 = new Usuario("Eduard","Apatachioae","1234X");
            //nombre=null, apellido=null, dni=null, correo=null, telefono=0, pass=null, nacionalidad=null;
        Usuario usuario2 = new Usuario("Ciprian","Picus", "5679Z",697990566);
            ////nombre=null, apellido=null, dni=null, correo=null, telefono=0, pass=null, nacionalidad=null;

        //Imprimir el nombre de un usuario vemos que nos da un error porque ese dato es privado y por eso no podemos aceder a el.
        //System.out.println(usuario1.nombre);
        //Pero hay una opcion para aceder a ese dato de forma indirecta con Setter (establecen un nuevo valor)y Getter (cogen el valor)
        System.out.println(usuario1.getNombre());
        System.out.println(usuario2.getNombre());
        System.out.println(usuario3.getNombre());

        //cambiar el nombre al usuario2
        usuario2.setNombre("Pepi");
        System.out.println(usuario2.getNombre());
        usuario1.saludar("hola, espero que aprendas mucho");
        usuario2.mostrarDatos();
        usuario1.mostrarDatos();

        Aula aula = new Aula(usuario2,usuario3);
        aula.mostrarDatosUsuarios();

    }
}
