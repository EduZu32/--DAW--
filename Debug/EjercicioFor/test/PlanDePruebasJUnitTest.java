import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanDePruebasJUnitTest {

    @Test
    void test(){
        PlanDePruebasJUnit r = new PlanDePruebasJUnit(3,4);
        assertAll(
                () -> assertEquals(12, r.area()),
                () -> assertEquals(14, r.perimetro())
        );
    }

}