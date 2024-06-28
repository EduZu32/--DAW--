public class Operaciones {

    public  int sumar (int a, int b){
        return a+b;
    }
    public  double restar (int a, int b){
        return (double) a-b;
    }
    public  int multiplicar(int a,int b){
        return a*b;
    }
    public double dividir (int a, int b){
        return (double) a/b;
    }
    public int generarAleatrio(int i){
        return (int) (Math.random()*(i+1));
    }


    //Recursividad -> algo que se llama a si mismo
    //caculo de un factorial
    //5! = 5 * 4 * 3 * 2 * 1

    //Lista todos los directorios(y su conetenido del s.o)

    public int calcularFactorial(int numero) {

        //supongamos  que te doy 1->1 (si te da uno automaticamente ha llegado al fin de posibilidades)

        /*Supongasmo que en vez de uno es 4
        Factorial del numero 4 es 4*3*2*1 = 12
        4*3= 12
        12*2 = 24
        24*1 = 24
        4 * (3*(2*(1*1))) se multipilica de derecha a izquierda 1*2=2*3=6*4=24
        Montemto en el que hay que parar es cuado el numero llegue a 1.
        */
        if (numero == 1) {
            return 1;
        }
        return numero * calcularFactorial(numero -1);


    }
}
