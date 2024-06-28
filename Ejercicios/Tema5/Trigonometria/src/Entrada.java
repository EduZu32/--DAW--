import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

public class Entrada {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(7);
        Cuadrado cuadrado = new Cuadrado(7,4);
        Triangulo triangulo = new Triangulo(10,7);
        circulo.mostrarDatos();
        System.out.println();
        cuadrado.mostrarDatos();
        System.out.println();
        triangulo.mostrarDatos();

    }
}
