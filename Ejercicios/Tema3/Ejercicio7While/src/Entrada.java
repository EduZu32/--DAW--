import java.util.Scanner;

public class Entrada {
    /*
    Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
    - Bienvenido a la aplicación del menú -
    1. Opción1 -
    2. Opción2 -
    3. Opción3 -
    4. Opción4 -
    5. Salir -
    Introduce la opción seleccionada
    Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato. Dependiendo de la opción
    seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X".
    En el caso de meter una diferente pondrá "opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)
    ***********************************************************************************************************************************
    Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las opciones disponibles
    - Bienvenido a la aplicación de calculos -
     Introduce operando uno: -
      Introduce operando dos: -
      1. Sumar -
      2. Restar -
      3. Multiplicar -
      4. Dividir -
      5. Módulo -
      6. Salir -
      Selecciona la operacion que quieres realizar.
     Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por pantalla de
     la siguiente forma "El resultado de la operación es:".
     Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numUno;
        int numDos;
        System.out.println("- Bienvenido a la aplicacion de caculos -");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Modulo");
        System.out.println("6.- Salir");
        System.out.println();
        System.out.println("Introduce el primer numero que te gustaria calcular: ");
        numUno =scanner.nextInt();
        System.out.println("Introduce el segundo numero que te gustaria calcular: ");
        numDos =scanner.nextInt();

        do {
            System.out.println("Introduce la opcion seleccionada");
            opcion = scanner.nextInt();

            int resultadoSuma;
            int resultadoResta;
            int resultadoMulti;
            double resultadoDivision;
            int resultadoMedia;
            switch (opcion) {
                case 1:
                   resultadoSuma = numUno + numDos;
                    System.out.println("El resultado de la suma es: "+resultadoSuma);
                    break;
                case 2:
                    resultadoResta = numUno - numDos;
                    System.out.println("El resultado de la resta es: "+resultadoResta);
                    break;
                case 3:
                    resultadoMulti = numUno * numDos;
                    System.out.println("El resultado de la multiplicacion es: "+resultadoMulti);
                    break;
                case 4:
                    resultadoDivision = (double) numUno / numDos;
                    System.out.println("El resultado de la division es: "+resultadoDivision);
                    break;
                case 5:
                    resultadoMedia = numUno % numDos;
                    System.out.println("El resultado de la media es: "+resultadoMedia);
                    break;
                case 6:
                    System.out.println("Salir");
                    break;

            }
        } while (opcion != 6);
    }

}
