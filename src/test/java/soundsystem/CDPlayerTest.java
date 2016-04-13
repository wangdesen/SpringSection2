package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 依赖注入测试类
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

  //自动装配播放器
  @Autowired
  private MediaPlayer player;
  
  //自动装配唱片
  @Autowired
  private CompactDisc cd;
  
  /**
   * 测试cd是否装配成功
   * */
  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
  }

  /**
   * 测试player是否注入
   * */
  @Test
  public void play() {
    player.play();
    assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
  }

}
