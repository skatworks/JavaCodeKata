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

}