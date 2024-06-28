public class Operaciones {
    public void accesoElemento(){
        String dato = null;
        String[] datos = new String[]{"Hola","esto","es","un","array"};
        try{
            System.out.println(datos[3]);
            System.out.println("La longitud del dato es "+dato.length());
        }catch (NullPointerException e){
            System.out.println("Capturando null");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Capturando array index");
        }catch (Exception e){
            System.out.println("Capturado el resto de errores");
        }
        System.out.println("Terminando la ejecucion del merdoo accesoElemento");
    }
}
