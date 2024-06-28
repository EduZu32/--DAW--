import java.util.Scanner;

public class Entrada {
    /*
     * Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y muestre un mensaje de calificación
     * utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nota de  1 al 5:");
        int nota = scanner.nextInt();
        String notaCoregida;

        switch (nota) {
            case 1:
                notaCoregida = "Suspenso";
                break;
            case 2:
                notaCoregida = "Aprobado";
                break;
            case 3:
                notaCoregida = "Notable";
                break;
            case 4:
                notaCoregida = "Sobresaliente";
                break;
            case 5:
                notaCoregida = "Matricula";
                break;
            default:
                System.out.println("Numero no comprendido");
                return;
        }
        System.out.println(notaCoregida);
        scanner.close();
    }
}
