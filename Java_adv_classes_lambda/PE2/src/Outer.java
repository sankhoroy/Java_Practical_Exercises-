public class Outer {
	public  class Inner {
		public Inner() {
			System.out.println("Inner object created");
		}
	}
	public Outer() {
		System.out.println("Outer object created");
	}
	public Inner f()
	{
		System.out.println("f() methood called ");
		Inner i = new Inner();
		return i;
	}
}