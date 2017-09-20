

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
public class pe3 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a word:");
		String s = inp.next();
		int l =  s.length();
		String ans="";
		
		for(int i=0;i<l;i++)
		{
			if( !(Character.isLetter(s.charAt(i))) )
				System.out.print("Not-a-letter "); 
			else if ( vowel(s.charAt(i)))
				System.out.print("Vowel ");
			else 
				System.out.print("Consonant ");
			
			
			
		}
		
		System.out.println("");
		
		inp.close();
		
		

}
	public static boolean vowel(char c)
	{
		if((c == 'a')||(c == 'A'))
			return  true;
		else if((c == 'e')||(c == 'E'))
			return  true;
		else if((c == 'i')||(c == 'I'))
			return  true;
		else if((c == 'o')||(c == 'O'))
			return  true;
		else if((c == 'u')||(c == 'U'))
			return  true;
		
		
		return false;
	}
	  
	
	}
