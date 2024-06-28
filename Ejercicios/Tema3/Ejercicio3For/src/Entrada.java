public class Entrada {
    /*
     * Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)
     */
    public static void main(String[] args) {
        //Mostrar todas las tablas de multiplicar de 0 a 10
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 0; i < 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            System.out.println();
        }
    }
}

