package solid.open_closed;

import java.security.InvalidParameterException;

public class Calculator {
  public void calculate(CalculatorOperation calculatorOperation) {
    if (calculatorOperation == null) {
      throw new InvalidParameterException("Can not perform operation");
    }
    calculatorOperation.perform();
  }
}
