public class Entrada {
    /*Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
    En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se
    introdujeron los números 2, 8 y 6). SumaTres.java
    * */

    public static void main(String[] args) {
        int numeroUno = 40;
        int numeroDos = 12;
        int numeroTres = 8;

        if (numeroUno + numeroDos == numeroTres){
            System.out.println("El numero "+ numeroTres+" es la suma de "+ numeroUno +" + "+ numeroDos);
        }else if(numeroTres + numeroUno == numeroDos){
            System.out.println("El numero "+ numeroDos+" es la suma de "+ numeroTres +" + "+ numeroUno);;
        }else if (numeroDos + numeroTres == numeroUno){
            System.out.println("El numero "+ numeroUno+" es la suma de "+ numeroTres +" + "+ numeroDos);;
        }else {
            System.out.println("Ningun numero es la suma de los otros dos numeros");
        }
    }
}
