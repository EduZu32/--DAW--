import java.util.Scanner;

public class Entrada {
    /*
    * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
Nota: para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501);
    * */
    public static void main(String[] args) {
        int [] array = new int[100];

        //llenar array con numeros aleatrios
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*501);
        }

        //mostrar el array original
        System.out.println("Array original: ");
        mostrarArray(array);

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Desea descargat el maximo (M) o el minimo (m)? ");
        char opcion = teclado.next().charAt(0);

        if (opcion == 'M' || opcion == 'm'){
            int indiceDescartado = opcion == 'M' ? indiceMaximo(array) : indiceMinimo(array);
            descartarNumero(array, indiceDescartado);
        }else{
            System.out.println("Opcion invalida. No se descartara ningun numero.");
        }

        //Mostrar el array con el numero descartado
        System.out.println("Array con el numero descartado: ");
        mostrarArray(array);
    }
    //Metodo para mostrar el contenido de un array
    public static void mostrarArray(int[] array){
        for ( int num  : array ) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    //Metodo para encontrar el indice del maximo en un array
    public static int indiceMaximo(int[] array){
        int max = array[0];
        int indice = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                indice = i;
            }
        }
        return indice;
    }
    //Metodo para encontrar el indice del minimo en un array
    public static int indiceMinimo(int[] array){
        int min = array[0];
        int indice = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                indice = i;
            }
        }
        return indice;
    }

    //metodo para detectar un numero en un array colocando entre dobles asteriscos
    public static void descartarNumero(int[] array, int indice){
        array[indice] = -array[indice];//cambiar el numero negativo por el distiguirlo visualemnte
    }
}
