
public class Second {

	public Second() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		First f1 = f();
		f1.Print();

	}
	
	public static First f() {
		First f = new First() {
			@Override
			public void Print() {
				System.out.println("Anonymous Class creted.");
			}
		};
		
		return f;
	}

}
