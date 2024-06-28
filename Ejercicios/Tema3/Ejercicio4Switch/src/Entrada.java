import java.util.Scanner;

public class Entrada {
    /*
    *Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y muestre la cantidad
    *  de días que tiene ese mes, considerando años no bisiestos.
    * */
    public static void main(String[] args) {
        System.out.println("Ingrese un mes del año de 1 al 12");
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año");
        int año = scanner.nextInt();
        int resultado = año / 4;


        if( resultado * 4 == año){
            switch (mes){
                case 1:
                    System.out.println("Enero tiene 31 dias");
                    break;
                case 2:
                    System.out.println("Febrero tiene 29 dias porque el año introducido el bisiestro");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 dias");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 dias");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 dias");
                    break;
                case 6:
                    System.out.println("junio tiene 30 dias");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 dias");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 dias");
                    break;
                case 9:
                    System.out.println("Sptiembre tiene 30 dias");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 dias");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 30 dias");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 dias");
                    break;
            }
        }else {
            switch (mes){
                case 1:
                    System.out.println("Enero tiene 31 dias");
                    break;
                case 2:
                    System.out.println("Febrero tiene 28 dias porque el año no es bisiestro");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 dias");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 dias");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 dias");
                    break;
                case 6:
                    System.out.println("junio tiene 30 dias");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 dias");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 dias");
                    break;
                case 9:
                    System.out.println("Sptiembre tiene 30 dias");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 dias");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 30 dias");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 dias");
                    break;
            }
        }
    }
}
