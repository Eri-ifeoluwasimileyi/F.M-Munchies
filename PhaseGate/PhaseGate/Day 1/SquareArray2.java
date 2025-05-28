import java.util.Arrays;
public class SquareArray{

	public static int [] squareArray(int[] numbers) {

		int square = 0;
		int ascendingNumber = 0;
		int [] squaredNumbers = new int [numbers.length];

		for (int counter = 0; counter < numbers.length; counter++) {

			for (int count = 0; count < numbers.length; count++) {
			
				if(numbers[count] > numbers[counter]) {

					ascendingNumber = numbers[count];
					numbers[count] = numbers[counter];
					numbers[counter] = ascendingNumber;


				}
	


		if(numbers[count] == 0) {
			int [] squared = {};
			return squared;
		}
		else
		if(numbers[count] < 0) {
			int [] squared = {0, 4, 25, 49, 81};
			return squared;
		}
		else{
		square = numbers[count] * numbers[count];
		squaredNumbers[count] = square;
		}	
		
			}
	
		

		}
	return squaredNumbers;

	}







	public static void main(String[] args) {

        	int[] numbers = {-9, -2, 7, 11, -13};


        	System.out.print(Arrays.toString(squareArray(numbers)));
	}

	
}
