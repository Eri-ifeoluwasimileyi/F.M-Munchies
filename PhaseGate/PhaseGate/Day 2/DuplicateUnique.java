import java.util.Arrays;
public class DuplicateUnique{ 
	
	public static int[] duplicate(int[] numbers) {

		int[] result = new int[7];
		int uniqueCount = 0;
      		int unique = 0;

        	for (int counter = 0; counter < numbers.length; counter++) {
			int count = 0;

			for (int counter2 = 0; counter2 < numbers.length; counter2++) {

				if (numbers[counter] == numbers[counter2]) {	

					count++;
             			   }
				
			
          		  }


			if(numbers[counter] == 1){
			
			result[unique] = numbers[uniqueCount];
			}

           		 if (count == 1) {

				result += numbers[counter];
				uniqueCount++;
         		   }
	
      		  }
		return result;

 	
	}






	public static void main(String[] args) {

		
		int [] input = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

				System.out.print(Arrays.toString(DuplicateUnique.duplicate(input)));




	}
}