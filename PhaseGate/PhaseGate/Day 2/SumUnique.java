public class SumUnique {

	public static int uniqueNumbers(int[] numbers) {

		int result = 0;
		int uniqueCount = 0;
     

		for (int counter = 0; counter < numbers.length; counter++) {
			int count = 0;

			for (int counter2 = 0; counter2 < numbers.length; counter2++) {
                		if (numbers[counter] == numbers[counter2]) {
                		    count++;
               	 		}
            		}

            		if (count == 1) {
				 result += numbers[counter];
		        }
	
	        }
		return result;

	    }





	public static void main(String[] args) {

		
		int [] input = {1, 2, 3, 4, 5};

		System.out.print(SumUnique.uniqueNumbers(input));




	}
}