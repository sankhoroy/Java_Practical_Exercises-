
public class Outer {


	public static void main(String[] args) {
		Hand h1 = f();
		h1.facepalm();

	}
	
	public static Hand f()
	{
		class Inner implements Hand
		{	@Override
			public void facepalm()
			{
				System.out.println(" facepalm() is called ");
			}
		}
		Hand h = new Inner ();
		return h;
	}
}
