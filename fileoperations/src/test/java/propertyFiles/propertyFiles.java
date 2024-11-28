package propertyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class propertyFiles {

	public static void main(String[] args) throws IOException {
		
		
		Properties pr = new Properties();
		
		//Write Data into Properties File
		
		File file5 = new File(System.getProperty("user.dir")+"\\testData\\config.properties");
		
		file5.createNewFile();
		
		FileOutputStream fout = new FileOutputStream(file5);
		
		pr.setProperty("name", "Raguram");
		pr.setProperty("Age", "28");
		pr.setProperty("Gender", "Male");
		
		pr.store(fout, "Data is Loaded");
		
		fout.close();
		
		//Read Data from Properties File
		
		FileInputStream fin = new FileInputStream(file5);
		
		pr.load(fin);
		
		String name = pr.getProperty("name");
		
		String Age = pr.getProperty("Age");
		
		System.out.println(name + "  - " + Age);
		
	Set<String> sn =	pr.stringPropertyNames();
	
	System.out.println(sn.toString());
	
	pr.keySet();
	
	Collection<Object> valu =pr.values();
	
	for (String object : pr.stringPropertyNames()) {
		
		System.out.println( object + " - " + pr.getProperty(object));
		
		
		
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
