package fr.floclem.testinteg;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   public Pair p = new Pair();
   @Test
   public void testPair() throws Exception {
		Assert.assertEquals("pair", p.isPair(2));
	}
}
