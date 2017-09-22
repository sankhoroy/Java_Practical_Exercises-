import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class pe4 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = null ;
		FileOutputStream f1 = null ;
		int counter = 0;
		try {
			f = new FileInputStream("/home/sankho/workspace/StackRoute/spring/Java_Practical_Exercises/classes_and_objects/PE4/src/input.txt");
			f1 = new FileOutputStream("/home/sankho/workspace/StackRoute/spring/Java_Practical_Exercises/classes_and_objects/PE4/src/output.txt");
			int  c;
			do {
				counter++;
				c = f.read();
				if(c != -1)
					System.out.print(Character.toUpperCase(((char)c)));
			}while(c!=-1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nLength of file : "+ counter);
		f1.close();
		f.close();
		
        

	}

}
