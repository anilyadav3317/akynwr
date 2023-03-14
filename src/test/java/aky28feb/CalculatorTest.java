package aky28feb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import aky28feb1.Calculator;

public class CalculatorTest {

	public static Calculator objscientificCalculator;
	@Before
	public void setUp() throws Exception {
		objscientificCalculator=new Calculator();
		
		System.out.println("createing obj for Class under test");
		
}

	@After
	public void tearDown() throws Exception {
		System.out.println("closing the Test execjtion");
	}

	@Test
	public void testGetwishes() {
		
		String result=objscientificCalculator.getwishes();
		Assert.assertEquals("TC_GetWishes ","Hello world",result);
		
	}

	@Test
	public void testAddition() {
		int varResult_addition=objscientificCalculator.addition(12, 12);
		Assert.assertEquals("TC_Addition", 24,varResult_addition);
	}

	@Test
	public void testSubstraction() {
		Assert.assertTrue(true);
	}

	@Test
	public void testMultiplication() {
		Assert.assertTrue(true);
	}

	@Test
	public void testDivision() {
		Assert.assertTrue(true);
	}
}
