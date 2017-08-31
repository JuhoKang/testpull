package ec.juho;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Created by rjdua on 2017-08-31.
 */

public class CalculatorTest {
  @Test
  public void sumTest() {
    Calculator calculator = Calculator.createCalculator();
    int sum = calculator.sum(1, 2);
    assertEquals(3, sum);
  }
}
