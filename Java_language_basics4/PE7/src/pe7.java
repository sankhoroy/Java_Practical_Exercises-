
import java.util.*;
public class pe7 {
public static void main(String[] args) {
ArrayList<String> c1= new ArrayList<String>();c1.add("Java");
c1.add("C");
c1.add("C++");
c1.add("Python");
c1.add("JavaScript");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Java");
c2.add("Angular");
c2.add("C++");
c2.add("JavaScript");
//Complete code to store the comparison output in
//ArrayList<String>
Iterator i = c1.iterator();
while(i.hasNext())
{Object o  = i.next();
if(c2.contains(o.toString() ))
	System.out.print("Yes ");
else
	System.out.print("No ");
}
System.out.println("");
	}
	}