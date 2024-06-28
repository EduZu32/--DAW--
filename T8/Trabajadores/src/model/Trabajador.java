package model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public abstract class Trabajador extends Persona {

    private int salario;

    public Trabajador() {
    }

    public Trabajador(String dni, String nombre, String correo, int salario) {
        super(dni, nombre, correo);
        this.salario = salario;
    }

    public abstract void trabajar();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario = " + salario);
    }
}
