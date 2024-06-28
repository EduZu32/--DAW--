package model;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
public class Asalariado extends Trabajador{

    private int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String dni, String nombre, String correo, int salario, int numeroPagas) {
        super(dni, nombre, correo, salario);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void trabajar() {
        System.out.println("Inciando la Jornada");
        System.out.println("numeroPagas = " + numeroPagas);
        System.out.println("Que sepas que eres un trabajador");
    }

}
