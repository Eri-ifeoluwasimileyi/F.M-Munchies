import java.util.Arrays;

public class DescendingArray {

	public static int [] combine(int [] numbers, int [] scores) {


		int descendingNumber = 0;

		int [] combineArray = new int [numbers.length + scores.length];


		for(int counter = 0; counter < numbers.length; counter++) {

			combineArray[counter] = numbers[counter];

		}
	
		for (int count = 0; count < scores.length; count++) {
			combineArray[numbers.length + count] = scores[count];
		}
		


		for (int counter = 0; counter < combineArray.length - 1; counter++) {

			for (int count = counter + 1; count < combineArray.length; count++) {
			
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
	
		int [] array1 = {1, 3, 5, 7};
		int [] array2 = {2, 4, 6, 8};
		int [] combined = DescendingArray.combine(array1, array2);

		System.out.print(Arrays.toString(combined));



	}


}