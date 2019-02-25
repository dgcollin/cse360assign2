package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		Calculator calcTest = new Calculator();
		calcTest.add(-1);
		calcTest.subtract(-1);
		calcTest.add(173);
		calcTest.divide(0);
		calcTest.add(4);
		calcTest.multiply(0);
		calcTest.add(1);
		calcTest.multiply(-3);
		System.out.println(calcTest.getTotal());
		System.out.println(calcTest.getHistory());
	}
}
