package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 通过自动装配，将CompactDisc注入到CDPlayer中
 * */
@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  //Spring创建CDPlayer Bean时，会通过这个构造器实例化并传入一个CompactDisc Bean
  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
