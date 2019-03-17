package oracleproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViewFileInfo {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:/LineTests/TestResults.txt");
		String read;

		try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {
			while ((read = reader.readLine()) != null)
				System.out.println(read);		
		}
		catch (FileNotFoundException fnfe) {
			System.err.println(fnfe);		
			} 
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}
