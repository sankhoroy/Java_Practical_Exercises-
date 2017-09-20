

import java.util.Scanner;

public class pe4 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = inp.nextInt();
		
		String s1 = "";
		String s2 = "";
		for(int i = 1;i <= a;i++)
			for(int j = 1;j <= i;j++)
				s1 =  s1 + " " + i;
		System.out.println(s1);
		
		inp.close();

}
	}
