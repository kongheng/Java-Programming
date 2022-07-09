package solid.liskov_substitution;

public class VLCMediaPlayer extends MediaPlayer {
  public void playVideo() {
    System.out.println("VLC playing video...");
  }
  public void playAudio() {
    System.out.println("VLC playing audio...");
  }
}
