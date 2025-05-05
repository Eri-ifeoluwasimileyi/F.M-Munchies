import java.util.Scanner;

public class FifthMultiple {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	Munchies newMunchies = new Munchies();
	
	System.out.print("Enter an integer: ");
	int number = input.nextInt();


	System.out.print(newMunchies.fifthMult(number));
	
	
	

}


}