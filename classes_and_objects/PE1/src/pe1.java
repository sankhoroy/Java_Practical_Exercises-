import java.util.Scanner;

public class pe1 {

	public static void main(String[] args) {

	}
	
	public static void pe1(String s) {

		String s1 = "";
		int l = s.length();
		
		for(int i=0;i<l;i++)
			s1 = s1 + s.charAt(l-i-1);
		
		System.out.println(s1 +  "\nThe string is:");
		System.out.println((s.equals(s1)?"Palindrome":"Not Palindrome"));
		
	}

}

