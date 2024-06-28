import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Figura2D> figuras2D = new ArrayList<>();
        figuras2D.add(new Circulo("circulo",2));
        figuras2D.add(new Triangulo("triagulo",2,4,5));
        figuras2D.add(new Rectangulo("rectangulo",2,4));

        for (Figura2D figura2D : figuras2D ) {
            System.out.println(figura2D.toString());
            figura2D.caclularPerimetro();
            System.out.println(figura2D.getPerimetro());
        }

    }
}
