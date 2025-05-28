import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquareArrayTest {


	@Test
	public void testTheSquareArray() {
	
	int[] myArray = {9, 2, 7, 0, 5};

	int[] expected = {0, 4, 25, 49, 81};

	int [] returned = SquareArray.squareArray(myArray);
	
	assertArrayEquals(expected, returned);

	}	

	@Test
	public void testTheSquareArrayEmpty() {
	
	int[] myArray = {};

	int[] expected = {};

	int [] returned = SquareArray.squareArray(myArray);
	
	assertArrayEquals(expected, returned);

	}



	@Test
	public void testTheSquareArrayNegative() {
	
	int[] myArray = {9, -2, 7, 0, -5};

	int[] expected = {0, 4, 25, 49, 81};

	int [] returned = SquareArray.squareArray(myArray);
	
	assertArrayEquals(expected, returned);

	}	


}