package model;

public class Terreno {

    private int metros;
    private Casa casa;

    public Terreno() {
    }

    public Terreno(int metros) {
        this.metros = metros;
    }
    public void construirCasa(){
        this.casa = new Casa(4,true);
    }
    public void hacerObras(){
        casa.construirPiscina();
    }

    public void mostrarDatos() {
        //capturar datos de la casa?
        casa.construirPiscina();
        System.out.println("Mostrando los datos del terrno");
        System.out.println("Los metos del terreno son :" + metros);
        casa.mostrarDatos();
    }


    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    class Casa {
        private int nrHabitaciones;
        private boolean piscina;

        private int metros;


        public Casa() {
        }

        public Casa(int nrHabitaciones, boolean piscina) {
            this.nrHabitaciones = nrHabitaciones;
            this.piscina = piscina;
        }

        public void mostrarDatos() {
            System.out.println("Mostrando los datos de la casa ");
            System.out.println("Habitaciones = " + nrHabitaciones);
            System.out.println("piscina = " + piscina);
        }

        public void construirPiscina(){
                System.out.println("Construiendo piscina");


        }

        public int getNrHabitaciones() {
            return nrHabitaciones;
        }

        public void setNrHabitaciones(int nrHabitaciones) {
            this.nrHabitaciones = nrHabitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }
}
