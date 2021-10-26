package SerializationAndDeserialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;                                       

public class SampleText {
	
   public static void main(String args[]) throws IOException
   {
	   
	   HashMap<String, String> hM = new HashMap<String, String>();
	   
	   for(Entry<String, String> eS: hM.entrySet())
		   System.out.println(eS.getKey() + " " +  eS.getValue());
	   
   }

}
