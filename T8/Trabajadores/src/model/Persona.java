package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Persona {
    private String dni, nombre, correo;

    //Construcor vacio @NoArgsConstructor
    //Constructor completo  @AllArgsConstructor
    //getter @Getter
    // setter @Setter


    public Persona() {
    }

    public Persona(String dni, String nombre, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
    }

    //Metodos
    public void mostrarDatos(){
        System.out.println(" dni: " +dni +" nombre: "+nombre+" correo: "+correo);
        System.out.println("nombre = " + nombre);
        System.out.println("correo = " + correo);
    }
}
