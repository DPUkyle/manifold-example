package bar;

import foo.Dummy;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

  @Test
  public void doesNothing() {
//    Assert.fail("intentional");
    Assert.assertEquals("First element should be 1", 1, (int) new Dummy().things().first());
  }
}