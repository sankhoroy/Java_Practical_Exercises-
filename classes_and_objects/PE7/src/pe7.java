import java.util.Scanner;

public class pe7 {

	public static void main(String[] args) {
		int f = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number to which we have list of factorials : ");
		int n = inp.nextInt();
		for(int i = 1 ;i <= n;i++)
		{	f *= i;
			if(i<17)
			{
				System.out.println("The factorial of "+i+" is "+f);
			}
			else
				System.out.println("The factorial of "+i+" is out of range.");
		}
		inp.close();
	}

}
