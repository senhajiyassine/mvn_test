package yassine;

import junit.framework.TestCase;

public class Testcalcule extends TestCase {

	public void testAdd()
	{
	    Calcule simo =new Calcule();
		assertTrue(3== simo.add(1,2));
	}
}
