import java.util.ArrayList;
import java.util.*;

public class Maintest {

	public static void main(String[] args) {
		//   
		
		Student s1 = new Student();
		s1.setId(1); 
		s1.setName("Alice");
		s1.setAge(9);
		
		Student s2 = new Student();
		s2.setId(2); 
		s2.setName("Elgin");
		s2.setAge(10);
		
		Student s3 = new Student();
		s3.setId(4); 
		s3.setName("Bob");
		s3.setAge(10);
		
		Student s4 = new Student();
		s4.setId(3); 
		s4.setName("Harry");
		s4.setAge(11);
		
		Student s5 = new Student();
		s5.setId(5); 
		s5.setName(" Olive");
		s5.setAge(12);
		
		Student s6 = new Student();
		s6.setId(6); 
		s6.setName("Harry");
		s6.setAge(11);
		
		
		List<Student> l = new ArrayList<Student>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		Collections.sort(l, new StudentSorter());;
		System.out.println("Id.   Name    Age");
		 for(Student a: l)   
	         System.out.println(a.getId()+".  "+a.getName() + "   "+a.getAge());
		
	}

}
