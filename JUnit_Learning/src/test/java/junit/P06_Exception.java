package junit;

import org.junit.Test;

public class P06_Exception {
	@Test
	public void testMethod() {
		System.out.println("test running");
	}
	@Test(expected = Exception.class)
	public void exceptionTest() {
		int i = 0;
		int j  = 10/i;
		System.out.println(j);
	}
}
