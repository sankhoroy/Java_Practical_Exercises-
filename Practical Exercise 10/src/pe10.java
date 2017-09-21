import java.util.Scanner;

public class pe10 {

	public static void main(String[] args) {
		Scanner inp  = new Scanner(System.in);
		System.out.println("Enter a string followed by a number :");
		String s = inp.next();
		int n = inp.nextInt();
		
		int l = s.length();
		System.out.print(s);
		
		String s1 = s.substring(l-n, l);
		
		for(int i = 0;i<n;i++)
			System.out.print(s1);
		
		System.out.println("\n");

	}

}
