import java.util.Scanner;

public class Ejercicio3MetodosParametos {
    //crea un array y rellenar con 10 numeros por teclado? y mostralo normal inverso normal


    public static void main(String[] args) {
        System.out.println("Ejercicio 3 con métodos");
        Scanner scanner = new Scanner(System.in);
        System.out.println("De cuantos numeros queires el 1º array");
        int numerosArray = scanner.nextInt();
        //llamar al metodo array ya esta relleno
        int[] numeros = rellenarArray(numerosArray);
        System.out.println("De cuantos numeros queires el 2º array");
        numerosArray = scanner.nextInt();
        int[] numeros2 = rellenarArray(numerosArray);
        System.out.println("Que array quieres mostar 1 o 2");
        int opcion = scanner.nextInt();
        System.out.println("En que orden quieres mostrarlo (normal - inverso)");
        String orden = scanner.next();
        if (opcion == 1){
            if(orden.equalsIgnoreCase("normal")){
                mostrarArray(numeros);
            }else {
                mostrarInverso(numeros);
            }
        }else {
            if(orden.equalsIgnoreCase("normal")){
                mostrarArray(numeros2);
            }else {
                mostrarInverso(numeros2);
            }
        }

        //llamar al metodo mostramos el array1 por pantalla
        //mostrarArray(numeros);
        //mostrarArray(numeros2);
        //llamar al metodo mostramos el arrayInverso por pantalla
        //mostrarInverso(numeros);
        //mostrarInverso(numeros2);
        //mostrarArray(numeros);
        //mostrarArray(numeros2);
    }


    //METODOS
    //rellenar array
    public static int[] rellenarArray(int n) {
        int numeros[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Indica numero");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        return numeros;
    }

    //mostrar array
    public static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }


    //mostrar array inverso
    public static void mostrarInverso(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
