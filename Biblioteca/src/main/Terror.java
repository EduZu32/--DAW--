package main;

public class Terror extends Libro{
    private int calificacion;

    public Terror() {
    }

    public Terror(String autor, int numeroPaginas, String ISBN, int calificacion) {
        super(autor, numeroPaginas, ISBN);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Genero del libro: Terror");
        System.out.println("Autor :" + autor);
        System.out.println("Numero de paginas: " +numeroPaginas);
        System.out.println("ISBN :"+ ISBN);
        System.out.println("Cafilicacion: "+ calificacion);
        System.out.println("*********************************************************************");
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
