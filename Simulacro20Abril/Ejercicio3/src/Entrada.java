import model.Ingrediente;
import model.Pizza;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Paso A: pedir al suaurio el nombre de la pizza
        System.out.println("Introduce el nombre de la pizza: ");
        String nombrePizza = teclado.nextLine();
        Pizza pizza = new Pizza(nombrePizza);

        //Paso B: Pedir  al usuario los ingredientes y sus precios
        System.out.println("Introduce los ingredientes de la pizza y sus precios, para finalizar el pedido introduce pagar ");
        System.out.println();
        while (true){
            System.out.println("Introduce el ingrediente: ");
            String nombreIngredientes= teclado.nextLine();
            if (nombreIngredientes.equalsIgnoreCase("pagar")){
                break;
            }
            System.out.println("Precio del ingrediente: ");
            double precioIngrediente = teclado.nextDouble();
            teclado.nextLine();
            Ingrediente ingrediente = new Ingrediente(nombreIngredientes,precioIngrediente);
            pizza.agregarIngrediente(ingrediente);
        }

        //Paso C: Mostrar la informacion  de la pizza
        System.out.println("Tu pizza "+pizza.getNombre() + " tiene un precio de "+ pizza.getPrecio()
        +" y sus ingredientes son :");
        for ( Ingrediente ingrediente : pizza.getIngredientes() ) {
            System.out.println(ingrediente.getNombre() + " - "+ ingrediente.getPrecio());
        }


    }
}
