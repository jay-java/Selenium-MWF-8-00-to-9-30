package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P03_CalcTest {
	@Test
	public void calc() {
		Calc c = new Calc();
		int actual = c.addition(12, 12);
		int expected = 25;
		assertEquals(expected, actual);
	}
}
