package bar;

import foo.Dummy;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

  @Test
  public void doesNothing() {
    Assert.assertEquals(1, new Dummy().things().first());
  }
}