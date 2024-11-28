package jsonFileOperations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
		
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File(".\\testData\\User2.json");
		
	Person person =	mapper.readValue(file, Person.class);
	
		
	System.out.println(person.firstName);
	
	System.out.println(person.getLastName());
	
	for (Address add : person.getAddress())
	{
	
	String City = add.getcity();
	
	String Town = add.gettown();
	 
	System.out.println(City + Town);
	
	}
	
}
}
