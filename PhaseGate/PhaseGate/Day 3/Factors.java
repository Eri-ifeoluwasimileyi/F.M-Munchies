import java.util.Arrays;

public class Factors {

		
	public static int [] factorsOfNum(int numbers) {

    	   	int factor = 1;
		int [] counterFactor = new int [5];

		for(int counter = 1; counter < numbers; counter++) {

      	    		  if (numbers % counter == 0) {
				factor[counterFactor]++;
             		  }
            		 //answer = factor[counterFactor] ; 
      		}


       	return counterFactor;	
	}


		

	


	public static void main(String[] args) {

		int input = 7;
		int input2 = 24;

	System.out.print(Arrays.toString(Factors.factorsOfNum(input)));
	




	}





}