package oracleproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {
	private Path p = Paths.get("C:/LineTests");
	private Path p2 = Paths.get("TestResults.txt");
	private Path p3 = p.resolve(p2);
	
	private void createDirectory() {
		try {
			if(Files.notExists(p))
				Files.createDirectories(p);
			if(Files.notExists(p3))
				Files.createDirectories(p3);
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}

	public void writeFile(EmployeeInfo employee) throws FileNotFoundException, IOException {
		createDirectory();
		File TestResults = new File(p3.toString());
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(TestResults, true)));
		writer.println(employee);
		writer.close();
	}
	public void writeFile(ArrayList<? extends Product> products) throws FileNotFoundException, IOException {
		createDirectory();
		File TestResults = new File(p3.toString());
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(TestResults, true)));
		for(Product p:products) {
			writer.println(p);
		}
			writer.close();
	} 
}
