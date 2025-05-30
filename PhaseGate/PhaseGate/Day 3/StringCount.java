public class StringCount {

	
	public static int stringHello(String hello, char letters) {

		String newHello = hello.toLowerCase();

		int counter = 0;
	
		for(int count = 0; count < newHello.length(); count++) {

			if(newHello.charAt(count) == letters) {
				
				counter++;
			}
		
					
	
	}

	return counter;


}



public static void main(String[] args) {
  
	
	String word = "Hello World";
	char letters = '0';
	

	System.out.print(StringCount.stringHello(word, letters));



}






}