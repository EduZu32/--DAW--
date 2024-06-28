import java.util.Scanner;

public class Entrada {
    /*
     * Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y,
     *  utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un codigo de producto de (1 al 7) para saber su precio: ");
        int codigo = scanner.nextInt();
        String producto1 = "Manzana";
        String producto2 = "Pera";
        String producto3 = "Kiwi";
        String producto4 = "Platano";
        String producto5 = "Uvas";
        String producto6 = "Mango";
        String producto7 = "Higos";
        double pecioManzana = 2.0;
        double precioPera = 1.5;
        double precioKiwi = 3.5;
        double precioPlatano = 2.5;
        double precioUvas = 3.2;
        double precioMango = 4.7;
        double precioHigos = 5.0;


        switch (codigo) {
            case 1:
                System.out.println("El producto elegido es: "+producto1 +" y su precio es :" +pecioManzana);
                break;
            case 2:
                System.out.println("El producto elegido es: "+producto2 +" y su precio es :" +precioPera);
                break;
            case 3:
                System.out.println("El producto elegido es: "+producto3 +" y su precio es :" +precioKiwi);
                break;
            case 4:
                System.out.println("El producto elegido es: "+producto4 +" y su precio es :" +precioPlatano);
                break;
            case 5:
                System.out.println("El producto elegido es: "+producto5 +" y su precio es :" +precioUvas);
                break;
            case 6:
                System.out.println("El producto elegido es: "+producto6 +" y su precio es :" +precioMango);
                break;
            case 7:
                System.out.println("El producto elegido es: "+producto7 +" y su precio es :" +precioHigos);
                break;
            default:
                System.out.println("Numero introducido no compredido");
                scanner.close();
        }
    }
}
