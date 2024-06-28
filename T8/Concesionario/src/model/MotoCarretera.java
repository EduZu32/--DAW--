package model;

public class MotoCarretera extends Vehiculo{

    private String tipoNeutatico;

    public MotoCarretera() {
    }

    public MotoCarretera(int bastidor, String marca, String modelo, int cc, int cv, String tipoNeutatico) {
        super(bastidor, marca, modelo, cc, cv);
        this.tipoNeutatico = tipoNeutatico;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo neumatico: "+ tipoNeutatico);
    }
    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+25);
    }
    public void realizarCaballito(){
        System.out.println("Estas realizando un caballito con la moto");
    }

    public String getTipoNeutatico() {
        return tipoNeutatico;
    }

    public void setTipoNeutatico(String tipoNeutatico) {
        this.tipoNeutatico = tipoNeutatico;
    }
}
