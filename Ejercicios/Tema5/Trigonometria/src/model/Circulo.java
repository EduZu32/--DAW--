package model;

public class Circulo {
    private double radio,diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    //metodos
    public double calcularArea(double radio){
        return Math.PI * radio * radio;
    }

    public double caclularDiametro(double radio){
        return 2* radio;
    }
    public void mostrarDatos(){
        System.out.println("********************************************");
        System.out.println("El area del circulo es: "+calcularArea(radio));
        System.out.println("El diametro del circulo es: "+ caclularDiametro(radio));
        System.out.println("********************************************");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
