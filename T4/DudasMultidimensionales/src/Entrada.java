public class Entrada {
    static int [][] cuadradoMagico = new int[3][3];
    static  boolean esMagico = true;
    static int sumaMAgica = 0, sumaAuxiliar = 0;
    public static void main(String[] args) {


        rellenarCuadrado();
        mostrarCuadrado();
        //es magico?suma fila 1,2,3 suma columna1,2,3 suma diagonal 1,2 = iguales
        //111
        //111
        //111 este seria un cuadrado magico porque todas las sumas son = 3 en todas la posibles sumas de filas y columnas
        do {
            rellenarCuadrado();
            for (int i = 0; i < cuadradoMagico.length; i++) {
                //contar filas
                sumaAuxiliar= 0;
                for (int j = 0; j < cuadradoMagico.length; j++) {
                    if(i==0){
                        sumaMAgica += cuadradoMagico[i][0];
                    }else{
                        sumaAuxiliar += cuadradoMagico[i][j];
                    }
                }
                if (sumaAuxiliar == sumaMAgica){
                    esMagico = false;
                    break;
                }
                //contar diagonal
                    //cuadradoMagico[i][i]
            }
        }while (!esMagico);

        //>EL CUADRADO ES MAGICO


        /*int sumaColumna1 = 0,sumaColumna2 = 0,sumaColumna3 = 0;
        for (int i = 0; i <= cuadradoMagico[0].length ; i++) {
            sumaColumna1 = sumaColumna1 + cuadradoMagico[i][0];
        }
        for (int i = 0; i <= cuadradoMagico[0].length ; i++) {
            sumaColumna2 = sumaColumna2 + cuadradoMagico[i][1];
        }
        for (int i = 0; i <= cuadradoMagico[0].length ; i++) {
            sumaColumna3 = sumaColumna3 + cuadradoMagico[i][2];
        }

        if(sumaColumna1 == sumaColumna2 && sumaColumna1 == sumaColumna3){
            System.out.println("El cuadrado es magico");

        }else {
            rellenarCuadrado();
        }*/

    }

    public static void rellenarCuadrado(){

        for (int i = 0; i < cuadradoMagico.length; i++) {
            //recorrer las filas
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                //escribir en una columna
                int aleatorio;
                do{
                    aleatorio = (int) (Math.random()*20);
                }while (estaNumero(aleatorio));
                //¿ya esta en el cuadrado?
                cuadradoMagico[i][j] = aleatorio;

            }

        }

    }

    //garantizar que no se repite un el numero
    public static boolean estaNumero(int numero) {
        for ( int[] fila : cuadradoMagico) {
            for (int item : fila) {
                if(item == numero){
                    return true;
                }
            }
        }
        return false;
    }

    public static  void mostrarCuadrado(){
        for ( int[] fila : cuadradoMagico) {
            for ( int item : fila ) {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}

