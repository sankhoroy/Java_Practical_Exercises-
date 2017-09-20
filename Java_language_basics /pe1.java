

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
public class pe1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number:");
		String s = inp.next();
		String s1 = "";
		int l = s.length();
		
		for(int i=0;i<l;i++)
			s1 = s1 + s.charAt(l-i-1);
		
		if(s.equals(s1))
		{
			System.out.print(s + " is a Palindrome");
			int sum = 0;
			if(s.length() >= 2)
			{
				
				for(int i = 0;i < l;i++)
				{
					int n = (int)(s.charAt(i)-'0');
					sum += (((n%2) == 0)?n:0);
				}
				
			}
			
			if(sum > 25)
				System.out.println(" and sum of even numbers is greater than 25");
			else if(sum < 25)
				System.out.println(" and sum of even numbers is less than 25");
			
		}
		else 
			System.out.println(s + " is not a Palindrome");
		
		inp.close();

}
	}
