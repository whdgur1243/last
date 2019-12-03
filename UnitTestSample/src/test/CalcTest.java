package test;

import static org.junit.Assert.*;

import org.junit.Test;
import calc.Calculator;




public class CalcTest {

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		Calculator calc = new Calculator();
		assertEquals(2, calc.mult(3,1));
		//단정문
//		assertArrayEquals(expected, actuals);
//		assertSame();
//		assertTrue();
//		assertNotNull();
		
	}
	
//	@Test
//	@ExpectsException(type = ArithmeticException.class, message="gg")
//	{
//		
//	}
	
	

}
