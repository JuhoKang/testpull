package ec.juho;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Calculator c = Calculator.createCalculator();

    System.out.println(c.sum(1,2));
  }
}
