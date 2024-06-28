package model;

public class Juego {
    private String jugadoUno;
    private String jugadorDos;
    private int ganador;

    //Constructores
    public Juego() {
    }

    public Juego(String jugadoUno, String jugadorDos) {
        this.jugadoUno = jugadoUno;
        this.jugadorDos = jugadorDos;
    }

    //Metodos

    public void definirGanador(){
            if (jugadoUno.equalsIgnoreCase(jugadorDos)){
                System.out.println("Empate");
            }else {
                ganador = 2;
                switch (jugadoUno){
                    case "piedra":
                        if (jugadorDos.equalsIgnoreCase("tijera")){
                            ganador = 1;
                        }
                        break;
                    case "papel":
                        if (jugadorDos.equalsIgnoreCase("piedra")){
                            ganador = 1;
                        }
                        break;
                    case "tijera":
                        if (jugadorDos.equalsIgnoreCase("papel")){
                            ganador = 1;
                        }
                        break;
                    case "salir":
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("No has introducido una plabra valida.");
                        ganador = 0;
                }
                System.out.println("Gane el jugador "+ ganador);
            }



    }

    //Getter & Setter

    public String getJugadoUno() {
        return jugadoUno;
    }

    public void setJugadoUno(String jugadoUno) {
        this.jugadoUno = jugadoUno;
    }

    public String getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(String jugadorDos) {
        this.jugadorDos = jugadorDos;
    }
}
