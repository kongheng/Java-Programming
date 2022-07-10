package solid.liskov_substitution;

public class VLCMediaPlayer implements MediaPlayer {

  @Override
  public void playVideo() {
    System.out.println("VLC playing video...");
  }

  @Override
  public void playAudio() {
    System.out.println("VLC playing audio...");
  }
}
