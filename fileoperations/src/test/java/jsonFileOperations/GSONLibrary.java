package jsonFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class GSONLibrary {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileReader rd = new FileReader(".\\testData\\User.json");
		
		Gson gson = new Gson();
		
		Person person = gson.fromJson(rd, Person.class);
		
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
