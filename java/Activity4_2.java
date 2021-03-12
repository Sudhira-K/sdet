package JavaActivitySession4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {
	
	public static void main(String[] args) throws IOException {
		boolean fstatus=false;
		File file = new File("src//kiran.txt");
		
			 fstatus = file.createNewFile();
		
		if(fstatus)
		{
			System.out.println("File Created sucessfully : "+file.getName());
		}
		else
		{
			System.out.println("File already exists :"+file.getName());
		}
		
		//Write data to file
		
			FileWriter  fwriter = new FileWriter("src//kiran.txt");
			fwriter.write("Files in Java might be tricky, but it is fun enough!");
			fwriter.close();
		
		
		//Create Directory
		File destDir = new File("src//resources");
        //Copy file to directory
      
			FileUtils.copyFileToDirectory(file, destDir);
	
        
        //Get New file from Directory
        File newFile  = FileUtils.getFile(destDir, "kiran.txt");
      //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        //Print it
        System.out.println("Data in new file: " + newFileData);
	}
	
}
