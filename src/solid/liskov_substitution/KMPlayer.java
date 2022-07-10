package solid.liskov_substitution;

public class KMPlayer implements MediaPlayer {

  @Override
  public void playVideo() {
    System.out.println("KM Playing video...");
  }

  @Override
  public void playAudio() {
    System.out.println("KM Playing audio...");
  }
}
