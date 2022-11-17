package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testnum {

	@Test
	public void test() {
		Func F = new Func();
		assertEquals(3, F.addn(1, 2));
	}

}
