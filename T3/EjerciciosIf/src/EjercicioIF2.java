public class EjercicioIF2 {
    /*
    * Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
    * En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java*/


    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 5;
        int numero3 = 7;

        if (numero3 == numero1 + numero2){
            System.out.println(numero3 +" = "+ numero1+" + "+ numero2);
        }else {
            System.out.println("Ninguno es suma de los otros dos");
        }
    }
}
