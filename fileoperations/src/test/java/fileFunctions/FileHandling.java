package fileFunctions;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\raguram.ramdoss\\eclipse-workspace");
		
		//To check if it's an File
		
		System.out.println(file.isFile());
		
		//To check if it's an Folder
		
		System.out.println(file.isDirectory());
		
		System.out.println(file.canExecute() + " " +  file.canRead() +  " " + file.canWrite());
		
	File []	 file1= file.listFiles();
	
	for (File file2 : file1) {
		
		System.out.println(file2.getName());
		
	}

	}

}
