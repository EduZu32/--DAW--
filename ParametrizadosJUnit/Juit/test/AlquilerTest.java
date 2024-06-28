import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class AlquilerTest {
    private int PrecioDiario;
    private int BonoDescuento;
    private int NumeroDias;
    private int PrecioTotal;

    public AlquilerTest(int PrecioDiario,int BonoDescuento, int NumeroDias, int PrecioTotal ) {
        this.PrecioDiario = PrecioDiario;
        this.BonoDescuento = BonoDescuento;
        this.NumeroDias = NumeroDias;
        this.PrecioTotal = PrecioTotal;
    }

    @Parameters
    public static Collection<Object[]> datos() {// Creo una colección que almaceno en un arraylist con las cuantro
        // valores que antes definí y los valores para realizar mi test
        return Arrays.asList(new Object[][] { { 5,1,5,24 }, { 10,2,10,98 }, { 15,3,7,102 } }); }

    @Test
    public void reservaCoche() {
        // El test lo hago con todos los valores de los onjetos del arraylist
        Alquiler reserva = new Alquiler(PrecioDiario,BonoDescuento);
        int precio = reserva.reservarCoche(NumeroDias);
        // Calculo el precio total de mi reserva
        assertEquals("Error", PrecioTotal, precio);// precio es la variable que me devuelve el método y resultado es el de la colección. } }
    }
}

