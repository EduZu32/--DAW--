public class PlanDePruebasJUnit {
    private int ancho;
    private int alto;

    public PlanDePruebasJUnit(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int area() {
        return ancho * alto;
    }

    public int perimetro() {
        return 2 * (ancho +alto);
    }

}
