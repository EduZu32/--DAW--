import model.Persona;

public class Entrada {
    public static void main(String[] args) {

        Persona persona = new Persona("Luis","Garcia","123456789P",33,180,78.0);
        persona.mostrarDatos();
        System.out.println();
        Persona persona1 = new Persona("Marta","Fernandez","23445678L",34);
        persona1.mostrarDatos2();
        System.out.println();
        Persona persona2 = new Persona("Mery","Lobato");
        persona2.mostrarDatos();
        System.out.println();
        Persona persona3 = new Persona();
        persona3.mostrarDatos();
        persona.asignarDato(20);
        persona.mostrarDatos();

        System.out.println("El IMC de Luis es: " + persona.cacularIMC());

    }
}
