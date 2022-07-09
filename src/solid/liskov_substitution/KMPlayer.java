package solid.liskov_substitution;

public class KMPlayer extends MediaPlayer {
  public void playVideo() {
    System.out.println("KM Playing video...");
  }
  public void playAudio() {
    System.out.println("KM Playing audio...");
  }
}
