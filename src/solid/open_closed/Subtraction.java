package solid.open_closed;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subtraction implements CalculatorOperation {

  private double left;
  private double right;
  private double result;

  @Override
  public void perform() {
    result = right - left;
  }

  public static Subtraction subtractionBuilder(double left, double right) {
    return Subtraction.builder()
        .left(left)
        .right(right)
        .build();
  }
}
