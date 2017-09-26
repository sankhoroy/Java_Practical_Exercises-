import java.util.HashMap;
import java.util.Scanner;

public class pe2 {

	public pe2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		Scanner inp = new Scanner(System.in);
		//String s = inp.nextLine();
		String s =  "one one -one___two,,three,one @three*one?two";
		String[] words = s.split("[^a-zA-Z]+");
		
		for(int i =  0;i<words.length;i++)
		{
			if(!h.containsKey(words[i]))
			{
				h.put(words[i], 1);
			}
			else
			{
				int  j = h.get(words[i]) + 1;
				h.put(words[i], j);
			}
		}
		inp.close();
		System.out.println(h.entrySet());

	}

}
