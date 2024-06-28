package model;

public class Reloj {

    private int hora;

    public Reloj() {
    }

    public Reloj(int hora) {
        this.hora =hora;
    }

    public void mostrarHora(){
        if (hora <= 6 || hora <= 12){
            System.out.println("Buenos dias");
        }else if (hora <= 13 || hora <= 20){
            System.out.println("Buenas tardes");
        }else {
            System.out.println("Buenas noches");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
