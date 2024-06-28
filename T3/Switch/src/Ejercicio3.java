public class Ejercicio3 {
    /*
    * Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.*/
    public static void main(String[] args) {

        int numeroEntero;

        numeroEntero = 9;
        if (numeroEntero %2 == 0){
            numeroEntero = 'i';
        }
        switch (numeroEntero){
            case 'i':
                System.out.println("Es Par");
                break;
            default:
                System.out.println("Es Impar");
                break;
        }
    }
}
