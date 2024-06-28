import model.Juego;

import java.util.Scanner;

public class Entrada {
    /*
    * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si
    alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
    Ejemplo 1:
    Turno del jugador 1 (introduzca piedra, papel o tijera): papel
    Turno del jugador 2 (introduzca piedra, papel o tijera): papel
    Empate
    Ejemplo 2:
    Turno del jugador 1 (introduzca piedra, papel o tijera): papel
    Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
    Gana el jugador 2
    Ejemplo 3:
    Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
    Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
    Gana el jugador 1

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego();
        System.out.println("Turno del jugador 1 introduzca (piedra, papel o tijera): ");
        juego.setJugadoUno(scanner.nextLine());
        System.out.println("Turno del jugador 2 introduzca (piedra, papel o tijera): ");
        juego.setJugadorDos(scanner.nextLine());
        juego.definirGanador();
        scanner.close();
    }
}
