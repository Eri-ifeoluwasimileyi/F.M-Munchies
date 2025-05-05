public class Munchies {

	public int fifthMult(int number) {

		int multiple = number * 5;
	
		return multiple;

	}


	
	public int sumOfNumber(int number) {

		int remNumber = 0;
		int sum = 0;

		while(number != 0) {
	
			remNumber = number % 10; 
			number = number / 10;

			sum = sum + remNumber;

		}
		  return sum;
	
	}



	public static boolean leapYear(int year) {
	
		return year % 4 == 0;
	

	}















}