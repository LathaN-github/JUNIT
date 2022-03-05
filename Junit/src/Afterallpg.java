

	import org.junit.jupiter.api.*;

	class Afterallpg {

	    @Test
	    void firstTest() {
	        System.out.println("Nagaraj");
	    }
	    @Test
	    void secondTest() {
	        System.out.println("M H");
	    }

	    @AfterAll
	    static void after() {
	        System.out.println("My Dad");
	    }
	

}
