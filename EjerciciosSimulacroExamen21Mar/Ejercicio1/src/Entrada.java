import util.*;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0; //quees lo que vamos a leer
        String nombre = null, apellido = null, email = null, dni = null;
        boolean salir = false;

        do {
            System.out.println("1.- Introduce nombre");
            System.out.println("2.- Introduce apellido");
            System.out.println("3.- Introduce dni");
            System.out.println("4.- Introduce email");
            System.out.println("5.- Salir");
            System.out.println("Que opcion quieres  realizar:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Caso nombre");
                    //solo hay letras
                    System.out.println("Introduce nombre: ");
                    nombre= teclado.next();
                    for (int i = 0; i < nombre.length(); i++) {
                        boolean isDigit = Character.isDigit(nombre.charAt(i));
                        if (isDigit) {
                            try {
                                throw new TipoDatoIncorrectoException("Hay un dato incorrecto: ");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Caso apellido");
                    System.out.println("Introduce apellido: ");
                    apellido= teclado.next();
                    for (int i = 0; i < apellido.length() - 1; i++) {
                        boolean isDigit = Character.isDigit(apellido.charAt(i));
                        if (isDigit) {
                            try {
                                throw new TipoDatoIncorrectoException("Hay un dato incorrecto: ");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Caso dni");
                    System.out.println("Introduce DNI");
                    dni = teclado.next();
                    //comprueba != 9
                    int longitud = dni.length();
                    try {
                        if (longitud != 9) {
                            throw new LongitudDNINoValidaException("No estan los 9 digitos");
                        }
                        //si los primeros 8 digitos no son numericos
                        for (int i = 0; i < dni.length() - 1; i++) {
                            boolean isDigit = Character.isDigit(dni.charAt(i));
                            if (!isDigit) {
                                throw new NumeracionContieneLetrasException("Hay un numero en el dni:");
                            }
                        }
                        //ultimo carracter no es letra
                        boolean isDigit = Character.isDigit(dni.charAt(dni.length() - 1));
                        if (isDigit) {
                            throw new UltimoDigitoNoLetraException("El ultimo digito no es una letra");
                        }
                    } catch (UltimoDigitoNoLetraException e) {
                        System.out.println(e.getMessage());
                    } catch (NumeracionContieneLetrasException e) {
                        System.out.println(e.getMessage());
                    } catch (LongitudDNINoValidaException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Comprobacion terminada");

                    break;
                case 4:
                    System.out.println("Caso email");
                    System.out.println("Introduce email");
                    email = teclado.next();
                    if(!email.contains("@") || !email.contains(".")){
                        try {
                            throw new EmailIncorrectoException("Email mal formateado: ");
                        } catch (EmailIncorrectoException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Comprobar si puedo salir");
                    if(nombre != null && apellido != null && email != null && dni != null){
                        salir = true;
                    }
                    break;
            }

        } while (opcion != 5 || !salir );//siempre y cuando sea diferrente a 5 que se reincie
    }
}
