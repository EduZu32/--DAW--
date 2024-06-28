import java.util.Scanner;

public class EntradaArrays {
    public static void main(String[] args) {
        /*
        * Tipos de arrays
        * int [] carton = new int[10]; 0 0 0 0 0 0 0 0 . . . desde 0 hasta 9 total 10 elementos
        * int [] carton = new int[]{1,23,4,6,7,67,44,66};
        * boolean [] aciertos = new boolean [10]; false false false... desde 0 hasta 9 total 10 elementos
        * boolean [] aciertos = new boolean []{false,true,true,false};
        * String [] palabras = new String [10]; null null null ... desde 0 hasta 9 total 10 elementos
        * String [] palabras = new String []{"hola","adios","bien", "mal"}
        * Objetc[] cosas = new Object [2] null null null... desde 0 hasta 9 total 10 elementos
        * Objetc[] cosas = new Object []{1,false,"hola", 'a'};
        * */

        int [] carton = new int[]{1,23,4,6,7,67,44,66};
        boolean [] aciertos = new boolean []{false,true,true,false};
        String [] palabras = new String []{"hola","adios","bien", "mal"};
        Object [] cosas = new Object []{1,false,"hola", 'a'};

        //Array multidimensiones (lineas + columnas)
        int [][] matriz = new int[3][3];
        /*
        matiz.length -> numero de filas -> 3
        matriz[0].length -> numero de columas de la fila 0 -> 3
        matriz[1].length -> numero de columas de la fila 0 -> 3

        * 3 filas
        * 3 columas


        * 6  9  0
        * 0  32  0
        * 0  0  0
        */

        int [][] matrizRellena = new int[][]{ {4,6,9,10,44},{4,7,23,14},{3,33,23,15,55},{8,99,78,2}};
        /* Se pueden añadir mas columnas indenpendientemente de las final que haya pero normalmente suelen ser exactas.
        Ejemplo
        int [][] matrizRellena = new int[][]{ {4,6,9,10,44,12},{4,7,23,14},{3,33,23,15,55},{8,99,78,2}};
        4 6 9 10 44 12
        4 7 23 14
        3 33 23 15 55
        8 99 78 2

        Acceder a una posicion de la matriz
        * */
        //Coger un elemento individual
        //Arrays normales

        /*
        System.out.println(carton[1]);
        System.out.println(aciertos[1]);
        System.out.println(palabras[1]);
        System.out.println(cosas[3]);
        //Array multidimesionales
        System.out.println(matriz[0][0]);//0 porque esa matriz es de timpo int y no tiene asigando ningun valor asi que por defecto son 0.
        System.out.println(matrizRellena[2][1]); //33
        */

        //Asiganr un valor a una posicion de la matriz
        //matriz[1][1] = 32;

        //Cambiar todos lo valores de la fila 0;
        //matriz [0][0] = 6;
        //matriz [0][1] = 9;
        //Este metodo para hacerlo con solo 1 dato esta bien pero si queremos asignar 80 columnas no lo hacemos de esta forma.Lo hacemos con un for.

        for (int i = 0; i < matriz.length; i++) {
            //recorro todas las filas -> [0, hasta matriz.length]
            for (int j = 0; j < matriz[i].length; j++) {
                //tecorro las columnas  ->[0 hasta matriz[i].length]
                matriz[i][j] = (int) (Math.random()*99);//Generamos numero aleatrios hasta 20 en la fila 0 del array
            }

        }

        /*
        //Sacar los todos valores de la fila 0;
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[0][i]+ " ");
        }
        System.out.println();
        //Sacar los todos valores de la fila 1;
        for (int i = 0; i < matriz[1].length; i++) {
            System.out.print(matriz[1][i]+ " ");
        }
        System.out.println();
        //Sacar los todos valores de la fila 2;
        for (int i = 0; i < matriz[2].length; i++) {
            System.out.print(matriz[2][i]+ " ");
        }
        * O imprimimos los datos de los array
        */
        /*
        //Recorrer todos los elementos:
        for (int i = 0; i < matriz.length; i++) {
            //recorremos las filas
            for (int j = 0; j < matriz[i].length; j++) {
                //recorremos las columnas
                System.out.print(matriz[i][j]+ " ");
            }
            //Salto delinea cada vez que termina el for
            System.out.println();
        }
        */
            //Reccorer el array con un foreach
            //(lo que me encuentro en cada vuelta (filas que son arrays) : lo que quiero recorrer)
        for ( int [] fila : matriz ) {
            for ( int item : fila ) {
                System.out.print(item+" ");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que numero quieres buscar en la matriz");
        int numeroBuscar = scanner.nextInt();

        //busca cosas dentro de la matriz

        boolean enncontrado = false;
        for ( int [] fila : matriz ) {
            for ( int item : fila ) {
                if (item == numeroBuscar){
                    enncontrado = true;
                    //Si encuentras el numero haces break no preguntas mas
                    break;
                }
            }
        }
        //si o no
        if (enncontrado){
            System.out.println("El numero introducita se encuentra en la matriz");
        }else {
            System.out.println("El numero introducido no se encuentra en la matriz");
        }

    }


}
