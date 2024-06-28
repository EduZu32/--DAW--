public class Abecedario {
    private int altura;

    public Abecedario() {
    }


    public void pintarLetraL(){
        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i <= altura / 2; i++) {
            System.out.print("* ");
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
