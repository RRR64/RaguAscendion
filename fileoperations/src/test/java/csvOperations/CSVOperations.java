package csvOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVOperations {

	public static void main(String[] args) throws IOException {
		
		File file = new File(".\\testData\\pipeline.csv");
		
		file.createNewFile();
		//Write Operations in csv
		FileWriter writer = new FileWriter(file);
		
		writer.append("Name,Age,Gender" + "/t");
		writer.append("Ragu,25,Male"+ "/t");
		writer.append("Ram,28,Male"+ "/t");
		writer.close();
		//Approach 1 : Read Data 
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter(",");
		
		while(sc.hasNext())
		{
		System.out.println(sc.next());
	}
		
		
		//Approach 2 :Read Data
		
		FileReader rd = new FileReader(file);
		
		BufferedReader br = new BufferedReader(rd);
		
		String line = null ;
		
		while((line=br.readLine())!=null)
		{
			
		String[] data	=line.split(",");
		
		for(int i=0;i<data.length;i++)
		{
		System.out.println(data[i]);
		}

}
}
}