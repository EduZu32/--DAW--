package controller;

import model.Coche;
import model.Garaje;
import model.Motor;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear garaje
        Garaje garaje = new Garaje();


        //Crear 2 coches
        Coche coche1 = new Coche("Ford","Mondeo");
        Coche coche2 = new Coche("Fiat","Panda");


        //asignar motores a los coches
        coche1.setMotor(new Motor(100));
        coche2.setMotor(new Motor(70));

        for (int i = 0; i < 2; i++) {
            if (garaje.aceparCoche(coche1, "Averia1")){
                System.out.println("Coche 1 aceptado en el garaje.");
                //Tratar la averia y acumular un importe aleatorio
                double precioAveria = Math.random() *100;//Importe aleatrio entre 0 y 100;
                coche1.acumularAveria(precioAveria);
                if("aceite1".equalsIgnoreCase("Averia1")){
                    //Si la averia es "aceite", incrementar en 10 los litros de aceite
                    Motor motorCochhe1 = coche1.getMotor();
                    if (motorCochhe1 != null){
                        motorCochhe1.setLitrosAceite(motorCochhe1.getLitrosAceite()+10);
                    }
                }
                //Devovler el coche al garaje
                garaje.devolverCoche();
            }else {
                System.out.println("No se puede aceptar el Coche 1 en el garaje.Garaje ocupado");
            }

            if (garaje.aceparCoche(coche2, "Averia2")){
                System.out.println("Coche 2 aceptado en el garaje.");
                //Tratar la averia y acumular un importe aleatrorio
                double precioAveria = Math.random()*100;//importe aleatroio entre 0 y 100;
                coche2.acumularAveria(precioAveria);
                if ("aceite2".equalsIgnoreCase("aceite2")){
                    Motor motorCoche2 = coche2.getMotor();
                    if (motorCoche2 != null){
                        motorCoche2.setLitrosAceite(motorCoche2.getLitrosAceite()+10);
                    }
                }
                //Devovler el coche al garaje
                garaje.devolverCoche();
            }else {
                System.out.println("No se puede aceptar el Coche 2 en el garaje.Garaje ocupado");
            }

        }
        System.out.println();
        //Mostrar la informacion de los coches al final del main
        System.out.println("Informacion del Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModel());
        System.out.println("Litros de aceite: " + coche1.getMotor() != null ? coche1.getMotor().getLitrosAceite() : "No disponible");
        System.out.println("Precio de averia acumulado: " +coche1.getPrecioAcumulado());

        System.out.println();

        System.out.println("Informacion del Coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModel());
        System.out.println("Litros de aceite: " + coche2.getMotor() != null ? coche2.getMotor().getLitrosAceite() : "No disponible");
        System.out.println("Precio de averia acumulado: " +coche2.getPrecioAcumulado());



    }
}
