package model;

public class Coche extends Garaje{
    private Motor motor;
    private String marca, modelo;
    private double precioAcumulado;

    public Coche() {
    }

    public Coche(String modelo, String marca) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAcumulado = 0.0;
    }


    public void acumularAveria(double importe) {
        this.precioAcumulado += importe;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return modelo;
    }

    public void setModel(String model) {
        this.modelo = model;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void setPrecioAcumulado(double precioAcumulado) {
        this.precioAcumulado = precioAcumulado;
    }
}
