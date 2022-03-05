

	import org.junit.jupiter.api.*;

	class Beforeeachpg {
	    @BeforeEach
	    void init(TestInfo testInfo) {
	        String callingTest = testInfo.getTestMethod().get().getName();
	        System.out.println(callingTest);
	    }

	    @Test
	    void firstTest() {
	        System.out.println("puneeth");
	    }

	    @Test
	    void secondTest() {
	        System.out.println("rajkumar");
	    }
	}


