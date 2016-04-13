package soundsystem.autoconfig;
import org.springframework.stereotype.Component;

/**
 * 一个具体的CD，作为组件
 * */
@Component
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
