public class Munchies {

	public static int fifthMult(int number) {

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

	public static String age(int ageYears) {
		
		long ageInYears = ageYears * 1;
		
		long ageInMonths = ageYears * 12;
		
		long ageInDays = ageYears * 365;

		long ageInMinutes = ageYears * 525600;	
		
		long ageInSeconds = ageYears * 31536000;
	
	String age = "Age: " + ageInYears + " year(s), " + ageInMonths + " months, " +  ageInDays + " days, " + ageInMinutes + " minutes, " + ageInSeconds + " seconds ";  


	return age;

	}


	public static String dogAge(String dogname, int humanYears) {		
		int dogYears = humanYears * 7;

	String answer = "His name is " + dogname + ". His age is " + dogYears;  		
		
	return answer;
	
	}




	public static void primeNumbers() {
	
		
		int primeNumCounter = 0;

		for(int number = 1; number < 2000000000; number++) {
			int primeCounter = 0;

			for(int counter = 1; counter <= number; counter = counter + 1) {

				if(number % counter == 0) {	

		 primeCounter++;

				}
      			}
		
			if(primeCounter == 2) {
				System.out.println(number);
				
				primeNumCounter++;									}

		if(primeNumCounter == 50) break;
	
		}
	
	}




}