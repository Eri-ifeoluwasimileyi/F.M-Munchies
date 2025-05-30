import java.util.Arrays;

public class SortNumbers {

	public static int [] combine(int [] numbers, int [] scores) {


		int descendingNumber = 0;

		int [] combineArray = new int [numbers.length + scores.length];


		for (int counter = 0; counter < combineArray.length; counter++) {

			for (int count = 0; count < combineArray.length; count++) {
			
				if(combineArray[counter] < combineArray[count]) {

					descendingNumber = combineArray[counter];

					combineArray[counter] = combineArray[count];

					combineArray[count] = descendingNumber;
				}				
			}		
		}

		
	return combineArray;

	}




	public static void main(String[] args) {
	
		int [] numbers = {1, 2, 5, 7};
		int [] scores = {3, 4, 6, 8};
		int [] combined = SortNumbers.combine(numbers, scores);

		System.out.print(Arrays.toString(combined));











}







}