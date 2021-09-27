package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisionTC {
  @Test
  public void checkingComparision() {
	  
	  Assert.assertTrue(76>7);
  }
}