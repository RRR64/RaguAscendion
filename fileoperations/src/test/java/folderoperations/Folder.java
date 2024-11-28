package folderoperations;

import java.io.File;

public class Folder {

	public static void main(String[] args) {
		
		String file = System.getProperty("user.dir") + "\\test";
		
		System.out.println(file);
		
		File file1 = new File(file);
		
		//Create a Folder
		
		file1.mkdir();
		
		File file2 = new File(System.getProperty("user.dir") + "\\test2");
		
		//Rename the File
		
		
		file1.renameTo(file2);
		
		//Check Existence
		
		System.out.println(file2.exists());
		
		//Delete the File
		
		file2.delete();
		
		System.out.println(file2.exists());
		
		
		

	}

}
