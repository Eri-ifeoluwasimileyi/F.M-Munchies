public class StringDigit {

	
	public static boolean stringDigit(String numbers) {

	
		int stringNum = 0;
	
		for(int count = 0; count < numbers.length(); count++) {
			int digit = 0;

			for(int index = 0; index < numbers.length(); index++) {

				if(count == numbers.charAt(index)) {
				
					stringNum++;
				}
			}
			if(stringNum == numbers.charAt(count)) {
				digit++;
			}
				

		if(digit == numbers.length()) {
		return true;
	
		}			
	
	}



}



public static void main(String[] args) {
  
	
	String numbers = "1210";

System.out.print(StringDigit.stringDigit(numbers));



}






}