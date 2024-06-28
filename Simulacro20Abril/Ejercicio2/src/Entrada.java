import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Entrada {
    /*
    * 2.	Crea un programa que realice las siguientes acciones:

a.	Pida al usuario 5 números entre el 1 y el 10 (1)
b.	Cree un array de 5 números aleatorios entre el 1 y el 10 que no sean repetidos (1.5)
c.	Muestra por consola la cantidad de aciertos que ha obtenido el usuario (1)
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Paso A. pedir 5 numeros

        int[] numerosUsuario = new int[5];

        System.out.println("Introduce 5 numeros entre 1 y 10: ");
        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.println("Numero " +(i + 1) + ": ");
            numerosUsuario[i]=teclado.nextInt();
            //validar que es desde 1 al 10
            while (numerosUsuario[i] < 1 || numerosUsuario[i] > 10){
                System.out.println("Por favor introduzca un numero estre 1 y 10: ");
                numerosUsuario[i] = teclado.nextInt();
            }
        }

        //Paso B. Crear array de 5 numeros
        int[] numerosAleatorios = generarNumerosAleatorios();

        //Paso C. Mostrar la catidad de  aciertos
        int aciertos = contarAciertos(numerosUsuario, numerosAleatorios);
        System.out.println("Cantidad de aciertos: "+aciertos);



    }
    //metodo para generar 5 numeros aleatorios entre 1 y 10:
    public static int[] generarNumerosAleatorios(){
        int[] numerosAleatorios = new int[5];
        boolean[] numerosUsados = new boolean[11];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = (int) (Math.random()*10)+1;

            }while (numerosUsados[numeroAleatorio]);
            numerosAleatorios[i] = numeroAleatorio;
            numerosUsados[numeroAleatorio] = true;
        }
        return numerosAleatorios;
    }
    //metodo para  contar la cantidad de aciertos
    public static int contarAciertos(int[] numerosUsuario, int[] numerosAleatorios){
        int aciertos= 0;
        for ( int numeroUsuario : numerosUsuario ) {
            for (int numeroAleatorio : numerosAleatorios){
                if (numeroUsuario == numeroAleatorio){
                    aciertos++;
                }
            }

        }
        return aciertos;
    }

}
