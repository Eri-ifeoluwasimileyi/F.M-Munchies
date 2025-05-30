import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestStringCount {

		

	@Test
	public void testStringCount() {

		String hello = "Hello World";

		char letters = 'o';

		int expected = 2;

		int returned = StringCount.stringHello(hello, letters);
	
		assertEquals(expected, returned);
	
	}
	


	@Test
	public void testStringCountAgain() {

		String hello = "Hello World";

		char letters = 'm';

		int expected = 0;

		int returned = StringCount.stringHello(hello, letters);
	
		assertEquals(expected, returned);
	
	}
}