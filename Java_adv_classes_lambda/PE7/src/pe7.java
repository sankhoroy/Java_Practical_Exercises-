import java.util.Scanner;

public class pe7 {

	public pe7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Isfactor f1 = (int n, int i)->{
			if((n%i) == 0) return true;
			else return false;
		};
		System.out.println("Number of input:");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		
		for(int i = 0;i < n;i++)
		{
			System.out.println("Enter two numbers:");
			int N = inp.nextInt();
			int I = inp.nextInt();
			if(f1.f(N, I) == true)
				System.out.println(I+" is a factor of "+N);
			else
				System.out.println(I+" is not a factor of "+N);
		}
	}

}
