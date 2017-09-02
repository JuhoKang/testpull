package ec.juho;

/**
 * Created by rjdua on 2017-08-31.
 */
public class Calculator {

  private Calculator() {
  }

  public static Calculator createCalculator() {
    return new Calculator();
  }

  /*
  return sum of two integers
   */
  public int sum(int a, int b) {
    return a+b;
  }

}
