import java.util.Scanner;

public class pe6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter char digit or special char:");
		String s = inp.next();
		char c = s.charAt(0);
		if( ((int)(c) <= 57)&& ((int)(c) >= 48) ) 
			System.out.println("Digit");
		else if( ((int)(c) <= 122) && ((int)(c) >= 97) ) 
			System.out.println("Small Case letter ");
		else if( ((int)(c) <= 90) && ((int)(c) >= 65) ) 
			System.out.println("Capital letter ");
		else
			System.out.println("Special character");

	}

}
