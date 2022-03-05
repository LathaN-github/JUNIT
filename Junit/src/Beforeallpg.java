

	import org.junit.jupiter.api.*;

	class Beforeallpg {

	    @BeforeAll
	    static void init() {
	        System.out.println("Only run once before all tests");
	    }

	    @Test
	    void firstTest() {
	        System.out.println(1);
	    }
	    @Test
	    void secondTest() {
	        System.out.println(2);
	    }
	}

		


