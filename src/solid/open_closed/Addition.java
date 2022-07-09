package solid.open_closed;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Addition implements CalculatorOperation {

  private double left;
  private double right;
  private double result;

  @Override
  public void perform() {
    result = left + right;
  }

  public static Addition additionBuilder(double left, double right) {
    return Addition.builder()
        .left(left)
        .right(right)
        .build();
  }
}
