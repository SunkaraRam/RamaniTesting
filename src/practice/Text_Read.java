package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import


java.io.FileReader;
import java.io.IOException;

public class Text_Read {

	public static void main(String[] args) {
		
		//The name of the file to Open
		
		String filename = "C:\\Users\\keert\\OneDrive\\Documents\\Details.txt";
		 
		String line=null;
		
		try {
			FileReader fileReader = new FileReader(filename);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			
			line=bufferedReader.readLine();
			
			System.out.println(line);
			//;
			
			//while ( (line=bufferedReader.readLine())!= null) {
					
				System.out.println(line );
				//}
		

			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		

		
	}

}
