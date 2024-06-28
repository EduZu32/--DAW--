public class Ejercicio6Metodos {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            String palabraGenerada = generarPalabras(generarAbecedario(),(int)(Math.random()*10));
            System.out.println(palabraGenerada);
        }



    }

    public static char[] generarAbecedario(){
        char[] letras =new char[]{'A','B','C','D','E','F','G','H','I','J'};
        return letras;
    }

    public static String generarPalabras(char[] j,int longitud){
        String palabra="";
        for (int i = 0; i < longitud; i++) {
            char letra = j [(int) (Math.random()*longitud)];
            palabra += letra;
        }
        return palabra;
    }
}
