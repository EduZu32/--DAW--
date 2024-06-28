package model;

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double cacularArea(int base, int altura){
        return base * altura;

    }
    public double calcularPerimetro(int altura, int base){
        return (altura*altura)+(base*base);
    }

    public void mostrarDatos(){
        System.out.println("********************************************");
        System.out.println("El area del cuadrado es: "+cacularArea(base,altura));
        System.out.println("El perimetro del cuadrado es: "+calcularPerimetro(altura,base));
        System.out.println("********************************************");
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
