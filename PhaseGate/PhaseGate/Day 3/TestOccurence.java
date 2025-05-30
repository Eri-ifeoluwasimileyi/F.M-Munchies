import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestOccurence {

		

	@Test
	public void testOccurenceNumbers() {

		int [] myArray = {1, 20, 8, 20, 5};

		int expected = 1;

		int returned = Occurence.occurenceArray(myArray);
	
		assertEquals(expected, returned);
	
	}


	@Test
	public void testOccurenceNumbersAgain1() {

		int[] numbers = {1, 2, 8, 20, 5};

		int expected = 3;

		int returned = Occurence.occurenceArray(numbers);
	
		assertEquals(expected, returned);
	
	}

	@Test
	public void testOccurenceNumbersA() {

		int[] numbers = {1, 2, 6, 4, 5, 5};

		int expected = 1;

		int returned = Occurence.occurenceArray(numbers);
	
		assertEquals(expected, returned);
	
	}




	@Test
	public void testOccurenceNumbersAgain() {

		int[] numbers = {1, 5, 8, 20, 50};

		int expected = 4;

		int returned = Occurence.occurenceArray(numbers);
	
		assertEquals(expected, returned);
	
	}

}