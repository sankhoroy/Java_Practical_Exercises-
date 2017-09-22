import java.util.Scanner;

public class pe6 {

	public static void main(String[] args) {

		double[] g  = new double[100];
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int n = inp.nextInt();
		
		System.out.println("Enter their grades respectively");
		 for(int i = 0;i<(n);i++)
			 g[i] = inp.nextInt();
		
     students s = new students(n,g);
     s.getgrades();
     inp.close();
	}
	

}
	

