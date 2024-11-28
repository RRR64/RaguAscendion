package fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          String file3 = System.getProperty("user.dir") + "\\testData";
		
		File file4 = new File(file3);
		
		file4.mkdir();
		
		
		String file = System.getProperty("user.dir") + "\\testData\\pipeline.txt";
		
		File file2 = new File(file);
		
		file2.createNewFile();
		
		System.out.println(file2.exists());
		
		FileWriter writer = new FileWriter(file2);
		//Write Data in Text File
		writer.write("Updated the data in Pipeline");
		
		writer.close();
		
		//Read Data in Text File
		Scanner sc = new Scanner(file2);
		
		while(sc.hasNextLine())
		{
		
		
		String te = sc.nextLine();
		
		System.out.println(te);
		
		}	
		
	}

}
