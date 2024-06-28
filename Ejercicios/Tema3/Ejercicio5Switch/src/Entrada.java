import java.util.Scanner;

public class Entrada {
    /*
     * Escribe un programa que pida al usuario ingresar un número del 1 al 12 y muestre el nombre del mes correspondiente
     *  utilizando una sentencia switch.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12 para mostrar el nombre del mes correspondiente: ");

        int mes = scanner.nextInt();

        String nombreMes;

        switch (mes) {
            case 1:
                nombreMes= "Enero";
                break;
            case 2:
                nombreMes= "Febrero";
                break;
            case 3:
                nombreMes= "Marzo";
                break;
            case 4:
                nombreMes= "Abril";
                break;
            case 5:
                nombreMes= "Mayo";
                break;
            case 6:
                nombreMes= "Junio";
                break;
            case 7:
                nombreMes= "Julio";
                break;
            case 8:
                nombreMes= "Agosto";
                break;
            case 9:
                nombreMes= "Septiembre";
                break;
            case 10:
                nombreMes= "Octubre";
                break;
            case 11:
                nombreMes= "Noviembre";
                break;
            case 12:
                nombreMes= "Diciembre";
                break;
            default:
                System.out.println("Numero ingresado no disponible");
                return;
        }
        System.out.println("El numero "+mes + " corresponde al mes de "+ nombreMes +".");
    }

}
