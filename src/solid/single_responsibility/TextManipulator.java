package solid.single_responsibility;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TextManipulator {

  private String text;

  public static TextManipulator TextManipulatorBuilder(String text) {
    return TextManipulator.builder().text(text).build();
  }

  public void appendText(String newText) {
    text = text.concat(newText);
  }

  public String findWordAndReplace(String word, String replacementWord) {
    if (text.contains(word)) {
      text = text.replace(word, replacementWord);
    }
    return text;
  }

  public String findWordAndDelete(String word) {
    if (text.contains(word)) {
      text = text.replace(word, "");
    }
    return text;
  }

  public void printText() {
    System.out.println(text);
  }
}
