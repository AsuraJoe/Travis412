package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(1, 1), 0);
	}
	
	@Test
	public void testMul() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(3, 5), 15);
	}
	
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(8, 2), 4);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.div(1, 0);
	}
	
	@Test
	public void testDivbyNegative() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(-8, 2), -4);
	}
	
	@Test
	public void testMul2Negatives() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(-1, -2), 2);
	}
	
	@Test
	public void testMulNegative() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(-1, 2), -2);
	}
}
