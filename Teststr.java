package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teststr {

	@Test
	public void test() {
		Func F = new Func();
		assertEquals("12", F.adds("1", "2"));
	}

}
