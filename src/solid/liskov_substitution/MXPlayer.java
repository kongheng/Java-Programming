package solid.liskov_substitution;

public class MXPlayer implements MediaPlayer {

  @Override
  public void playVideo() {
    System.out.println("MX Playing Video...");
  }

  @Override
  public void playAudio() {
    System.out.println("MX Playing Audio");
  }
}
