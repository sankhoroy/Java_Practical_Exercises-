import java.util.Scanner;

public class pe8 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Guess the secret number between 1-100");
		
		while(true) {
			int n;
			n = inp.nextInt();
			if( n < 43 )
				System.out.println("Number guessed is less than original number ");
			else if(43 < n)
				System.out.println("Number guessed is more than original number ");
			else
			{
				System.out.println("Number guessed matches the original number");
				break;
			}
		}

	}

}
