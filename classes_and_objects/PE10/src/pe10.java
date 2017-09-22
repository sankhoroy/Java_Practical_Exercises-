import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class pe10 {

	public static void main (String[] args) throws IOException {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String[] words = null;
		
			
		        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("/home/sankho/workspace/StackRoute/spring/Java_Practical_Exercises/classes_and_objects/PE10/src/input.txt"), "ASCII"));
		        while(true)
		        {
		            String line = fr.readLine();
		            if(line == null)
		                break;
		            
		             words = line.split(" ");
///////////////////////////////////////////////////////////  
		             for(int i  = 0;i < words.length ; i++){
		 				String word =  words[i];
		 				//System.out.println(word);
		 				if(!h.containsKey(word)) {
		 					//System.out.println(word);
		 					h.put(word, 1);
		 				}
		 				else
		 				{
		 					int jj = (int) h.get(word);
		 					h.put(word, jj+1);
		 				}
		        }
		        
		        
		    }/////////end of while

		        fr.close();
			
			System.out.println(h.entrySet());
			
			
	}
}


