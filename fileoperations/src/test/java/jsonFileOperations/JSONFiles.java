package jsonFileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFiles {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		File file = new File(".\\testData\\pipeline.json");
		
		file.createNewFile();
		
		
		JSONParser parser = new JSONParser();
		
		FileReader fin = new FileReader(file);
		
	Object obj =	parser.parse(fin);
	
	JSONObject job = (JSONObject) obj;
	
	long id = (long) job.get("id");
	
	Boolean boolean1 = (Boolean) job.get("boolean");
	
	JSONArray arr = (JSONArray) job.get("Personal Info");
	
	for(int i=0;i<arr.size();i++)
	{
	
	JSONObject obj2 = (JSONObject) arr.get(i);
	
	String name = (String) obj2.get("name");
	
	String Gender = (String) obj2.get("Gender");
	
	
	System.out.println(name + " : " + Gender);
	
		
	}

}
}