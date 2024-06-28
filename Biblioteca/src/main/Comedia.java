package main;

public class Comedia extends Libro{

    private String tipoHumor;

    public Comedia(){}

    public Comedia(String autor, int numeroPaginas, String ISBN, String tipoHumor) {
        super(autor, numeroPaginas, ISBN);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Genero del libro: Terror");
        System.out.println("Autor :" + autor);
        System.out.println("Numero de paginas: " +numeroPaginas);
        System.out.println("ISBN :"+ ISBN);
        System.out.println("Tipo de humor: "+ tipoHumor);
        System.out.println("*********************************************************************");
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
