import java.util.Scanner;


public class SumOfNumber {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	Munchies newMunchies = new Munchies();


	System.out.print("Enter an interger: ");
	int number = input.nextInt();



	System.out.print(newMunchies.sumOfNumber(number));

   }
}



