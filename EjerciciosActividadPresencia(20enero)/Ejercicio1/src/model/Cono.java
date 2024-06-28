package model;


public class Cono {

    private double conoAltura;
    private double conoRadio;

    private double volumenTotal;

    public Cono() {
    }

    public Cono(double conoAltura, double conoRadio) {
        this.conoAltura = conoAltura;
        this.conoRadio = conoRadio;
        this.volumenTotal = calcularVolumenTotal();
    }
    public void mostrarDatos(){
        System.out.println("La altura del cono ha sido de: "+ conoAltura);
        System.out.println("El radio del cono ha sido de: "+ conoRadio);
        System.out.println("El volumen total del cono es de: "+calcularVolumenTotal());
    }

    private double calcularVolumenTotal(){
        volumenTotal = (Math.PI * Math.pow(conoRadio,2) * conoAltura)/3;
        return volumenTotal;
    }

    public double getConoAltura() {
        return conoAltura;
    }

    public void setConoAltura(double conoAltura) {
        this.conoAltura = conoAltura;
    }

    public double getConoRadio() {
        return conoRadio;
    }

    public void setConoRadio(double conoRadio) {
        this.conoRadio = conoRadio;
    }

    public double getRadioTotal() {
        return volumenTotal;
    }

    public void setRadioTotal(double radioTotal) {
        this.volumenTotal = radioTotal;
    }
}
