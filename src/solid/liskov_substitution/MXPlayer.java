package solid.liskov_substitution;

public class MXPlayer extends MediaPlayer {
  public void playVideo() {
    System.out.println("MX Playing Video...");
  }
  public void playAudio() {
    System.out.println("MX Playing Audio");
  }
}
