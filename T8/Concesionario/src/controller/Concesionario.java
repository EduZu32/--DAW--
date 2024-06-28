package controller;

import model.*;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> listaVehiculos;

    public Concesionario(){
        listaVehiculos = new ArrayList<>();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        this.listaVehiculos.add(vehiculo);
    }

    public void listarStock(){
        for ( Vehiculo item : listaVehiculos ) {
            item.mostrarDatos();
        }
    }
    public void acelerarStock(){
        for (Vehiculo item: listaVehiculos){
            item.acelerar(10);
        }
    }

    public void listarDeportivos(){
        for ( Vehiculo item : listaVehiculos ){
            if (item instanceof Deportivo){
                item.mostrarDatos();
            }
        }
    }

    public void activarCaracteritica(){
        for ( Vehiculo item : listaVehiculos ) {

            if(item instanceof Deportivo){
                ((Deportivo) item).activarModoSport();
            } else if (item instanceof Todoterreno) {
                ((Todoterreno) item).subirPendiente();
            } else if (item instanceof Electrico) {
                ((Electrico) item).modoEco();
            }else if(item instanceof MotoCarretera) {
                ((MotoCarretera) item).realizarCaballito();

            }
        }
    }


}
