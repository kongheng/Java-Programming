package solid;

import java.util.ArrayList;
import solid.dependency_inversion.CustomerDataAccessFactory;
import solid.interface_segregation.Asean;
import solid.interface_segregation.Eagle;
import solid.liskov_substitution.KMPlayer;
import solid.liskov_substitution.MXPlayer;
import solid.liskov_substitution.MediaPlayer;
import solid.liskov_substitution.Player;
import solid.liskov_substitution.VLCMediaPlayer;
import solid.open_closed.Addition;
import solid.open_closed.Calculator;
import solid.open_closed.Subtraction;
import solid.single_responsibility.TextManipulator;
import solid.single_responsibility.TextPrinter;

public class Main {

  public static void main(String[] args) {

    //Single-Responsibility
    TextManipulator textManipulator = TextManipulator.TextManipulatorBuilder("Hello World!");
    TextPrinter textPrinter = new TextPrinter(textManipulator);
    textPrinter.printText();
    textPrinter.printOutEachWordOfText();
    textPrinter.printRangeOfCharacter(0, 4);

    //Open-Closed
    Addition addition = Addition.additionBuilder(10, 20);
    Subtraction subtraction = Subtraction.subtractionBuilder(45, 90);
    Calculator calculator = new Calculator();
    calculator.calculate(addition);
    calculator.calculate(subtraction);
    System.out.println(addition.getResult());

    //Liskov-Substitution
    ArrayList<MediaPlayer> mediaPlayers = new ArrayList<>();
    mediaPlayers.add(new VLCMediaPlayer());
    mediaPlayers.add(new MXPlayer());
    mediaPlayers.add(new KMPlayer());
    mediaPlayers.forEach(MediaPlayer::playVideo);
    VLCMediaPlayer vlcMediaPlayer = new VLCMediaPlayer();
    KMPlayer kmPlayer = new KMPlayer();
    MXPlayer mxPlayer = new MXPlayer();
    Player vlc = new Player(vlcMediaPlayer);
    Player km = new Player(kmPlayer);
    Player mx = new Player(mxPlayer);
    vlc.playVideo();
    km.playVideo();
    mx.playAudio();

    //Interface-Segregation
    Asean asean = new Asean();
    asean.eat();
    Eagle eagle = new Eagle();
    eagle.sleep();

    //Dependency-Inversion
    String customerName = CustomerDataAccessFactory.getInstanceOfCustomerDataAccess().getCustomerName(1);
    System.out.println(customerName);
  }
}
