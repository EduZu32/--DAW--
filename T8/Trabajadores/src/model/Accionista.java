package model;

public class Accionista extends Persona implements Responsables{

    public Accionista() {
    }

    public Accionista(String dni, String nombre, String correo) {
        super(dni, nombre, correo);
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El accionista ha entrado en escena y votara");
        int aleatroio =((int) (Math.random() * 10) / 2);
        System.out.println("El voto supremo del accionista es: " + aleatroio);
    }

}
