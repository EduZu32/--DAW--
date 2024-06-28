public class Entrada {
    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        double resultado = operaciones.dividir(2,2)* operaciones.sumar(4,4);



        System.out.println(sumar(6,7)*2); //13*2
        System.out.println(sumar(16,17)*2); //33*
        System.out.println(resultado);
        System.out.println(operaciones.generarAleatrio(100));
        System.out.println(operaciones.calcularFactorial(4));

    }
    //Tipo de metodo
    //private o publico o protected y lo que va retornar y un nombre
    public static int sumar (int a, int b){
        int suma = a +b;
        return suma;
        //System.out.println("La suma es "+ suma);
    }

}
