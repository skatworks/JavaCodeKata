package jp.co.solver.JavaCodeKata;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class MathCodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testComparisonKata() {
		MathCode mathCode = new MathCode();
		int valueSmall = 1;
		int valueLarge = 10;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}
	
	@Test
	public void testComparisonKataDouble() {
		MathCode mathCode = new MathCode();
		double valueSmall = 1.1;
		double valueLarge = 10.1;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}
	
	@Test
	public void testComparisonKataFloat() {
		MathCode mathCode = new MathCode();
		float valueSmall = 1.1F;
		float valueLarge = 10.1F;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}
	
//	@Test
//	public void testComparisonKataString() {
//		MathCode mathCode = new MathCode();
//		String valueSmall = "aaa";
//		int valueLarge = 10;
//
//		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));
//
//	}	
	
	@Test
	public void testComparisonKataClass() {
		MathCode mathCode = new MathCode();
		Float valueSmall = 1.1F;
		Float valueLarge = 10.1F;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}

	
	@Test
	public void testComparisonKataZero() {
		MathCode mathCode = new MathCode();
		int valueSmall = -0;
		int valueLarge = +0;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}

//	@Test
//	@SuppressWarnings("null")
//	public void testComparisonKataNull() {
//		MathCode mathCode = new MathCode();
//		Float valueSmall = null;
//		Float valueLarge = 10.1F;
//
//		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));
//
//	}
	
	@Test(expected = NullPointerException.class)
	@SuppressWarnings("null")
	public void testComparisonKataNullClear() {
		MathCode mathCode = new MathCode();
		Float valueSmall = null;
		Float valueLarge = 10.1F;

		assertThat(mathCode.maxKata(valueSmall, valueLarge), is(valueLarge));

	}
}