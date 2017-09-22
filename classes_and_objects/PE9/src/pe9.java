import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class pe9 {

   public static void main(String args[]) throws IOException {  
	   File folder = new File("/home/sankho/workspace/StackRoute/spring/Java_Practical_Exercises/classes_and_objects/PE9/src/Folder-PE9");
	   File[] listOfFiles = folder.listFiles();
	   
	   File[] files = folder.listFiles(
			    new FilenameFilter()
			    {
			        public boolean accept(final File a_directory,
			                              final String a_name)
			        {
			            return a_name.endsWith(".in");
			            
			        };
			    });
	   System.out.println("Selected files are : ");	   
	   for(int i = 0;i<files.length;i++ ) {
		   System.out.println(files[i].getName());
	   }
/////////////////////////////////////////////////////////////////////////	   
File file = new File(files[0].getName());

FileInputStream fin = null;

fin = new FileInputStream(file);
String pathname = "/home/sankho/workspace/StackRoute/spring/Java_Practical_Exercises/classes_and_objects/PE9/src/Folder-PE9" + files[0].getName();
Path path = Paths.get(pathname);
try {
    byte[] data = Files.readAllBytes(path);
} catch(Exception e) {
    System.out.println(e);
}
//////////////////////////////////////////////////////////
fin.close();
		    
	   }
   }

