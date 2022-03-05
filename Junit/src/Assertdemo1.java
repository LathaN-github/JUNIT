import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class Assertdemo1 {
	@Test
	public void simple()
	{
		int A = 1;
		int B = 1;
		assertEquals(A,B);
	}
	@Test
	public void simple1()
	{
		int A = 2;
		int B = 2;
		assertEquals(A,B);
	}
	@Test
	@Disabled
	public void simple2()
	{
		int A = 3;
		int B = 3;
		assertEquals(A,B);
	}

}
