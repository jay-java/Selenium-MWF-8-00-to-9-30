package junit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P07_Parameterized {
	int a;
	int b;
	int result;
	
	public P07_Parameterized(int a,int b,int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.addition(a, b);
		int expected = result;
		assertEquals(expected, actual);
	}
	
	@Parameters
	public static Object[][] passData() {
		Object o[][] = new Object[4][3];
		
		o[0][0] = 1;
		o[0][1] = 2;
		o[0][2] = 3;
		
		o[1][0] = 11;
		o[1][1] = 21;
		o[1][2] = 31;
		
		o[2][0] = 10;
		o[2][1] = 20;
		o[2][2] = 30;
		
		o[3][0] = 11;
		o[3][1] = 22;
		o[3][2] = 33;
		return o;
		
		
 		
	}
}
