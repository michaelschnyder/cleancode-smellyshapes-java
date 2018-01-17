package com.zuehlke.cleancodeworkshop.removeduplications;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.zuehlke.cleancodeworkshop.removeduplication.MathUtils;

public class MathUtilsTest {

	@Test
	public void testIsDivisibleBy3_Given_FactorsOf_3() {
		assertTrue(MathUtils.isDivisibleBy3(3));
		assertTrue(MathUtils.isDivisibleBy3(6));
		assertTrue(MathUtils.isDivisibleBy3(9));
		assertTrue(MathUtils.isDivisibleBy3(15));
		assertTrue(MathUtils.isDivisibleBy3(30));
	}

	@Test
	public void testIsDivisibleBy3_Given_Negative_FactorsOf_3() {
		assertTrue(MathUtils.isDivisibleBy3(-3));
		assertTrue(MathUtils.isDivisibleBy3(-6));
		assertTrue(MathUtils.isDivisibleBy3(-9));
		assertTrue(MathUtils.isDivisibleBy3(-15));
		assertTrue(MathUtils.isDivisibleBy3(-30));
	}
	
	@Test
	public void testIsDivisibleBy3_Given_FailingInputs() {
		assertFalse(MathUtils.isDivisibleBy3(2));
		assertFalse(MathUtils.isDivisibleBy3(4));
		assertFalse(MathUtils.isDivisibleBy3(10));
	}

	@Test
	public void testIsDivisibleBy3_Given_SpecialInputs() {
		// 0 is dividable by every number
		assertTrue(MathUtils.isDivisibleBy3(0));
		// 1 isn't dividable by any number exept 1 itself
		assertFalse(MathUtils.isDivisibleBy3(1));
	}

	// ----------------------------------------------------------
	
	@Test
	public void testIsDivisibleBy5_FactorsOf_5() {
		assertTrue(MathUtils.isDivisibleBy5(5));
		assertTrue(MathUtils.isDivisibleBy5(10));
		assertTrue(MathUtils.isDivisibleBy5(15));
		assertTrue(MathUtils.isDivisibleBy5(30));
	}

	@Test
	public void testIsDivisibleBy5_Given_Negative_FactorsOf_5() {
		assertTrue(MathUtils.isDivisibleBy5(-5));
		assertTrue(MathUtils.isDivisibleBy5(-10));
		assertTrue(MathUtils.isDivisibleBy5(-15));
		assertTrue(MathUtils.isDivisibleBy5(-30));
	}
	
	@Test
	public void testIsDivisibleBy5_Given_FailingInputs() {
		assertFalse(MathUtils.isDivisibleBy5(4));
		assertFalse(MathUtils.isDivisibleBy5(6));
	}

	@Test
	public void testIsDivisibleBy5_Given_SpecialInputs() {
		// 0 is dividable by every number
		assertTrue(MathUtils.isDivisibleBy5(0));
		// 1 isn't dividable by any number exept 1 itself
		assertFalse(MathUtils.isDivisibleBy5(1));
	}
}
