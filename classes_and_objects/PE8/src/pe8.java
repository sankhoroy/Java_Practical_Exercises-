

public class pe8 {

	public static void main(String[] args) {
		
		longFactorial(23);
		}
	
	
	public static void longFactorial(long n) {
		long f = 1;

		System.out.println("Enter a number to which we have list of factorials : ");

		for(long i = 1 ;i <= n;i++)
		{	f *= i;
			if(i<21)
			{
				System.out.println("The factorial of "+i+" is "+f);
			}
			else
				System.out.println("The factorial of "+i+" is out of range.");
	}

}

}