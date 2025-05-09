import java.util.Scanner;

public class DogAge {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	Munchies newMunchies = new Munchies();
	
	System.out.print("Enter the dog's name: ");
	String name = input.next();
	
	System.out.print("Enter his/her age in human years: ");
	int number = input.nextInt();


	System.out.print(newMunchies.dogAge(name, number));
	
	
	

}


}