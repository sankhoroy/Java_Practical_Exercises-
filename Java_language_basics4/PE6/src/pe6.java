import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.*;

public class pe6 {

	public pe6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SortedSet <String>  s = new TreeSet();
		s.add("Harry");//Harry Olive Alice Bluto Eugene
		s.add("Olive");
		s.add("Alice");
		s.add("Bluto");
		s.add("Eugene");
		
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Object x = i.next();
			System.out.print(x.toString()+" ");
		}
		System.out.println("");
	}

}
