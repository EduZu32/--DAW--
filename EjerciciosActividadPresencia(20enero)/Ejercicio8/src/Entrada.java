public class Entrada {
    /*
    * Crea una función con la siguiente cabecera:

        *public String convierteEnPalabras(int n)
        *
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una
cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:

        * cuatro, siete, cero, dos, uno, tres

Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una coma
detrás de cada palabra salvo al final.
    * */
    public static void main(String[] args) {
        int numero = 470213;
        String numeroEnPalabras = convierteEnPalabras (numero);
        System.out.println(numeroEnPalabras);

    }
    public static String convierteEnPalabras(int n){
        String[] palabras ={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};

        String resultado = "";
        String numeroStr = String.valueOf(n);
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            resultado += palabras[digito];
            if (i < numeroStr.length() - 1){
                resultado += ", ";
            }
        }

        return resultado;

    }

}
