package Calculator;

import java.lang.ArithmeticException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void sumTest() {
        Assertions.assertEquals(4, calc.sum(2, 2));
    }
    @Test
    void minusTest() {
        Assertions.assertEquals(4, calc.minus(5, 1));
    }
    @Test
    void multiTest() {
        Assertions.assertEquals(55, calc.multiplication(5,11));
    }
    @Test
    void divisionTest() {
        Assertions.assertEquals(2, calc.division(5,2));
        Assertions.assertThrows(ArithmeticException.class, () -> calc.division(5,0));
    }
}

