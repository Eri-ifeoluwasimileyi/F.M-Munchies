import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class TestDescending {



	@Test
	public void testDescendinNumbers() {

		int [] numbers = {1, 3, 5, 7};

		int [] scores = {2, 4, 6, 8};

		int expected = DescendingArray.combine(numbers, scores);

		assertArrayEquals(expected, returned);



	}







}