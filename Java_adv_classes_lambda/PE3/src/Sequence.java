
public class Sequence {
	private int size;
	public Sequence(int size) {
		this.size = size;
	}
	
	public class  ReverseSequenceSelector implements selector{
		@Override
		public int current()
		{
			return size;
		}
		@Override
		public int next()
		{
			return size--;
		}
		@Override
		public int end()
		{
			return 0;
		}
		
		public void f()
		{
			while(current() != end())
			{	next();
				System.out.println(current());
				
			}
		}
		
	}
}
