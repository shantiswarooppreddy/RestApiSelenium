package SerializationAndDeserialization;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;                                       

public class SampleText {
	
@SuppressWarnings("deprecation")
public static void main(String args[]) throws IOException
   {
	   
	  String contentOfFile = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\TextFile.txt"));
	  
	  FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\resources\\Output.txt");
	  BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
	  
	  for(int i = 65; i <= 90; i++)
	  {
		  int j = 0;
		  for(int k = 0; k < contentOfFile.length(); k++)
			  if((int) contentOfFile.charAt(k) == i || (int) contentOfFile.charAt(k) == i + 32)
				  j++;
		  bufferWriter.write((char)i + " " + j + "\n");
		  j = 0;
	  }
	  
	  bufferWriter.close();
	  fileWriter.close();
		  
	  
   }

}
