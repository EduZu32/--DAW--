package model;


import lombok.Getter;

import lombok.Setter;


@Setter
@Getter
public class Jefe extends Trabajador implements Responsables{
    private Puesto puesto;
    private  int porcAcciones;

    public Jefe() {
    }

    public Jefe(String dni, String nombre, String correo, int salario, int porcAcciones, Puesto puesto) {
        super(dni, nombre, correo, salario);
        this.puesto = puesto;
        this.porcAcciones = porcAcciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("percAcciones = " + porcAcciones);
        System.out.println(puesto.getDescripcion());
    }

    @Override
    public void trabajar() {
        System.out.println("El jese se pone a trabajar");
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio = (int) (Math.random()*5/2);
        System.out.println("El voto del jefe es :"+ aleatorio);
    }
}
