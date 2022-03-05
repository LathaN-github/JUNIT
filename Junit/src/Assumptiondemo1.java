import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptiondemo1 {
	@Test
	void testDev()
	{
		System.out.printf("ENV","DEV");//TRUE
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		//remainder of test will proceed
		
	}
	@Test
	void testOnProd()
	{
		System.setProperty("ENV","PROD");//TRUE
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),Assumptiondemo1::message);
		//remainder of test will be aborted
	}
	private static String message() {
		return "Today's TEST execution Failed::";
	}

}
