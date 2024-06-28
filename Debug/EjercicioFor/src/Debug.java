import java.util.Scanner;

public class Debug {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su nunmero: ");
            int numero = scanner.nextInt();

            for(int i = 0; i < 10; i++) {
                System.out.println("Numero "+(i+1)+":"+ numero);
                //modifica el numero introducido por teclado y despues de la 1º vuelta que comineza en el bucle for.
                numero = 3;




            }
            scanner.close();
            System.out.println("Ha terminado el bucle");

        }

    }

