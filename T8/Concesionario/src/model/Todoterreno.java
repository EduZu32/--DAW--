package model;

public class Todoterreno extends Vehiculo{

    private String traccion;


    public Todoterreno() {
    }

    public Todoterreno(int bastidor, String marca, String modelo, int cc, int cv, String traccion) {
        super(bastidor, marca, modelo, cc, cv);
        this.traccion = traccion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trracion :" + traccion);
    }
    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad);
    }
    public void subirPendiente(){
        System.out.println("Estas subiendo por una pendiente");
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
