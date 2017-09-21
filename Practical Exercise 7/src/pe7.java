import java.util.Arrays;
import java.util.Scanner;

public class pe7 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number:");
		String s = inp.nextLine();
		
		char[] a = s.toCharArray();
		Arrays.sort(a);
		String s1 = Arrays.toString(a);
		
		System.out.print("Sorted number in non-increasing order :");
		for(int i = 0;i<s.length();i++)
			System.out.print(a[i]);
		
		System.out.println("\n");
		int sum = 0;
		for(int i =0;i<s.length();i++)
		{
			int n = ((int)(a[i]-'0'));
			sum += (((n%2) == 0)? n:0 );
		}
		System.out.println("Sum of even numbers : " + sum+"\n");
		
		if(sum > 15) System.out.println("True");
		else System.out.println("False");

	}

}
