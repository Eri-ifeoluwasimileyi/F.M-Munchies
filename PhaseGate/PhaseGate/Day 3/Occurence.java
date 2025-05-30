
public class Occurence {


	public static int occurenceArray(int [] numbers) {


		int largestNumber = numbers[0];
		int counter = 0;

		for(int count = 0; count < numbers.length; count++) {

			if(numbers[count] > largestNumber) {

					largestNumber = numbers[count];

					counter = count;

			}
		} 

	return counter;
	}




	public static void main(String[] args) {

		int [] input = {1, 5, 3, 4, 5, 5};
		int [] input2 = {1, 2, 8, 20, 50};

		System.out.print(Occurence.occurenceArray(input));


}

}