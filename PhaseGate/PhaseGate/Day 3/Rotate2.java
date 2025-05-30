import java.util.Arrays;
public class Rotate2 {


	public static void main(String... args) {

	int [][] images = new int[3][3];
	
		images [0][0] = 1;
		images [0][1] = 2;
		images [0][2] = 3;

		images [1][0] = 4;
		images [1][1] = 5;
		images [1][2] = 6;

		images [2][0] = 7;
		images [2][1] = 8;
		images [2][2] = 9;



		for(int counter = 0; counter < 3; counter++) {

			for(int count = 0; count < 3; count++) {

				System.out.print((images[count][counter] + " "));				
			}
			System.out.println();
			
		
		}

	}



}
