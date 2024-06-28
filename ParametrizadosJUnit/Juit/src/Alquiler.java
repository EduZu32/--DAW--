public class Alquiler {

    private int precioDiaria;
    private int descuento;


    //Constructor
    public Alquiler(int precioDiaria, int descuento) {
        this.precioDiaria = precioDiaria;
        this.descuento = descuento;

    }

    //Metodo
    public int reservarCoche(int numeroDias) {
        if (numeroDias > 0) {
            int precio = ((precioDiaria * numeroDias) - (descuento));
            return precio;
        } else {
            return -1;
        }
    }
}
