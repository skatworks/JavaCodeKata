package jp.co.solver.JavaCodeKata;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HashMapCodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testClearKata() {
		HashMapCode map = new HashMapCode();
		HashMap<String, String> test = new HashMap<String, String>();
		test.put("Key1", "Value1");
		test.put("Key2", "Value2");
		
		assertThat(map.clearKata(test), is(new HashMap<String, String>()));
	}

}
