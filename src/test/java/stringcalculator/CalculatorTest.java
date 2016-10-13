package stringcalculator;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("stringcalculator.CalculatorTest");
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testSingleCorrectInput() {
		assertEquals(1, Calculator.add("1"));
		assertEquals(2, Calculator.add("2"));
		assertEquals(3, Calculator.add("3"));
		assertEquals(5, Calculator.add("5"));	
		assertEquals(8, Calculator.add("8"));

	}

	@Test
	public void testTwoCorrectInputs() {
		assertEquals(2, Calculator.add("1,1"));
		assertEquals(3, Calculator.add("1,2"));
		assertEquals(5, Calculator.add("2,3"));
		assertEquals(8, Calculator.add("3,5"));
		assertEquals(13, Calculator.add("5,8"));
	}

	@Test
	public void testTwoInputWithNewlineSeperator() {
		assertEquals(2, Calculator.add("1\n1"));
		assertEquals(3, Calculator.add("1\n2"));
		assertEquals(5, Calculator.add("2\n3"));
		assertEquals(8, Calculator.add("3\n5"));
		assertEquals(13, Calculator.add("5\n8"));
	}

	@Test
	public void testMultipleInputsWithMixedSeperators() {
		assertEquals(3, Calculator.add("1,2"));
		assertEquals(6, Calculator.add("1,2\n3"));
		assertEquals(5, Calculator.add("2,3"));
		assertEquals(9, Calculator.add("1\n3,5"));
		assertEquals(13, Calculator.add("5\n8"));
	}

	@Test
	public void testSingleNegativeException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(is("Negatives not allowed: [-2]"));
		Calculator.add("-2");
	}
	
	@Test
	public void testMultipleNegativeException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(is("Negatives not allowed: [-2, -3]"));
		Calculator.add("-2,2,-3");
	}
		
}
