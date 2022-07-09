package solid.liskov_substitution;

public class Player {
  private final MediaPlayer mediaPlayer;

  public Player(MediaPlayer mediaPlayer) {
    this.mediaPlayer = mediaPlayer;
  }

  public void playVideo() {
    mediaPlayer.playVideo();
  }

  public void playAudio() {
    mediaPlayer.playAudio();
  }
}
