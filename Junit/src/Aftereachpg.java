

	import org.junit.jupiter.api.*;

	class Aftereachpg {

	    @Test
	    void firstTest() {
	        System.out.println(1);
	    }
	    @Test
	    void secondTest() {
	        System.out.println(2);
	    }

	    @AfterEach
	    void after(TestInfo testInfo) {
	        String callingTest = testInfo.getTestMethod().get().getName();
	        System.out.println(callingTest);
	    }
	}


