

	
	public class students{
		int n;
		double[] grade  = new double[100];
		public  students(int N, double[] d)
		{
			this.n = N;
			this.grade = d;
			 
		}
		
		public void getgrades()
		{
			double max = -1;
			double min = Double.MAX_VALUE;
			double sum = 0;
			double avg;
			for(int i =0;i<(this.n);i++)
			{
				max = Math.max(this.grade[i], max);
				min = Math.min(this.grade[i], min);
				sum += grade[i];
			}
			
			avg = (sum/(this.n));
			System.out.println("The average is : "+ avg);
			System.out.println("The min is : "+ min);
			System.out.println("The max is : "+ max);
		}
}
