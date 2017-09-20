

import java.util.Scanner;

public class pe2 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = inp.nextInt();
		
		if((a >= 20) && (a <=  30)) {
			if((a%2) == 0)
				System.out.println("Jerry");
			else
				System.out.println("Tom");
		inp.close();
		}
		
		

}
	}
