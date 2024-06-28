public interface Programable {

    //Conjunto de metodos abstractos o constantes
    int IVA =21;
    void programar();

    default void metodoDefecto(){
        System.out.println("Este metodo lo tienen todas las clases que me han implementado");
    }
}
