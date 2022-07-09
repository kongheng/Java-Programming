package solid.single_responsibility;

import java.util.Arrays;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextPrinter {

  private final TextManipulator textManipulator;

  public void printText() {
    System.out.println(textManipulator.getText());
  }

  public void printOutEachWordOfText() {
    System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
  }

  public void printRangeOfCharacter(int startingIndex, int endIndex) {
    System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
  }
}
