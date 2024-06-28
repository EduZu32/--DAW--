//Interfaces -> metodo de comunicaciion entre clases que ya tienen una extension
//Herencias
//Polimorfismos
//Enum

//librerias externas
//Empresa

//Linea de herencia

        //Persona - nombre, dni, correo
        //mostrarDatos()

            //trabajador - salario

                //trabajar() - diferente de cada uno
                //jefes puesto(direccion, gerencia,mando), %acciones, realizarVotacion()
                //autonomos - salario, cuotas, seguro
                //Asalariados salario, numeroPagas

            //Accionistas- nombre, dni, correo
                //no tienen trabajar()
                //realizarVotacion() vamos a hacer una interfaz de comunicacion con jefe

//toda funcionalidad comun a las clses (pero no a todas) no  la puedo meter en la clase superior. En este caso la funcion realizarVotacion
//esta en los jefes y los acionistas. Para poder juntar 2 o mas clases que no tinen un punto comun
import controller.Empresa;
import model.*;

public class Entrada {

    public static void main(String[] args) {

        Asalariado asalariado = new Asalariado("Borja","Martinez","correo@gmail.com",10000,14);
        Asalariado asalariado2 = new Asalariado("David","Martinez","correo@gmail.com",10000,14);
        Asalariado asalariado3 = new Asalariado("Pepe","Martinez","correo@gmail.com",10000,14);
        Asalariado asalariado4 = new Asalariado("Monica","Martinez","correo@gmail.com",10000,14);
        Asalariado asalariado5 = new Asalariado("Carmen","Martinez","correo@gmail.com",10000,14);
        Asalariado asalariado6 = new Asalariado("Vanesa","Martinez","correo@gmail.com",10000,14);
        Jefe jefe1= new Jefe("Borja","Martinez","correo@gmail.com",60000,49, Puesto.direccion);
        Jefe jefe2 = new Jefe("Luis","Martinez","correo@gmail.com",10000,49,Puesto.gerencia);
        Accionista accionista = new Accionista("Borja","Martinez","correo@gmail.com");


        Empresa empresa = new Empresa();
        empresa.agregarPersona(asalariado);
        empresa.agregarPersona(asalariado2);
        empresa.agregarPersona(asalariado3);
        empresa.agregarPersona(asalariado4);
        empresa.agregarPersona(asalariado5);
        empresa.agregarPersona(asalariado6);
        empresa.agregarPersona(jefe1);
        empresa.agregarPersona(jefe2);
        empresa.agregarPersona(accionista);

        jefe2.mostrarDatos();

        //empresa.empezarJornadaLaboral();
        //empresa.realizarVotacion();

    }


}
