package model;

public class Triangulo {

    private int base, altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos


    public double calcularArea(int altura, int base){
        return (base * altura)/2.0;
    }
    public void mostrarDatos(){
        System.out.println("********************************************");
        System.out.println("El area del triangulo es: "+calcularArea(altura,base));
        System.out.println("********************************************");
    }

    //Getter Setter
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
}
