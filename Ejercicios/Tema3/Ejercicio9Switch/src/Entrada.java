import java.util.Scanner;

public class Entrada {
    /*
     *Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año
     * correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes de1 al 12 para verificar en que estacion del año estas: ");
        int numero = scanner.nextInt();
        // marzo a junio Primavera mes 3 al mes 6
        // junio a septiembre Verano 6 al mes 9
        // septiembre a diciembre Otoñoa 9 al mes 12 otoño
        // diciembre a marzo invierno 1 al mes 3 invierno
        String mesSelecionado;

        switch (numero) {
            case 3:
            case 4:
            case 5:
                mesSelecionado = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                mesSelecionado = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                mesSelecionado = "Otoño";
                break;
            case 12:
            case 1:
            case 2:
                mesSelecionado = "invierno";
                break;
            default:
                System.out.println("El numero introducido no es valido");
                return;
        }
        System.out.println("El numero introducido corrsponde a la estacion de: "+ mesSelecionado);
        System.out.println("Termina el programa");
    }
}
