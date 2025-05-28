import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestSumUnique {

		

	@Test
	public void testSumUnique() {

	int[] numbers = {1, 2, 3, 2};

	int expected = 4;

	int returned = SumUnique.uniqueNumbers(numbers);
	
	assertEquals(expected, returned);

	}
}