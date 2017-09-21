import java.util.Scanner;

public class pe9 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = inp.nextLine();
		int l = s.length();
		for(int i=l-1; i >= 0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n");

	}

}
