package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("stringcalculator.CalculatorTest");
	}
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testSingleCorrectInputString() {
		assertEquals(1, Calculator.add("1"));
		assertEquals(2, Calculator.add("2"));
		assertEquals(3, Calculator.add("3"));
		assertEquals(5, Calculator.add("5"));	
		assertEquals(8, Calculator.add("8"));

	}
}
