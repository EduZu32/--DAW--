import controller.Concesionario;
import model.*;

public class Entrada {
    public static void main(String[] args) {
       // Vehiculo vehiculo = new Vehiculo(1,"Ford","Focus",2000,120);
        Vehiculo deportivo = new Deportivo(1,"Ford","GT50",5000,500,400);
        Vehiculo electrico = new Electrico(2,"Tesla","Model S",2000,500,600);
        Vehiculo todoterreno = new Todoterreno(3,"Suzuki","Vitara",3000,200,"4x4");
        Vehiculo motoCarretera = new MotoCarretera(4,"Kawasaki","Ninja",1200,200,"Carretera");
        Concesionario concesionario = new Concesionario();

        concesionario.agregarVehiculo(deportivo);
        concesionario.agregarVehiculo(electrico);
        concesionario.agregarVehiculo(todoterreno);
        concesionario.agregarVehiculo(motoCarretera);

        //concesionario.activarCaracteritica();
        concesionario.listarDeportivos();

    }
}
