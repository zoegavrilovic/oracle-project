package oracleproject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.regex.*;
public class TestProductionline
{	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		Scanner in = new Scanner(System.in);
		EmployeeInfo employee = new EmployeeInfo();
		System.out.println(employee);
		
		ArrayList<Product> list = new ArrayList<>();
		ProcessFiles pf = new ProcessFiles();
		try {
			pf.writeFile(employee);
		}
		catch(IOException ioe) {
			System.err.println(ioe);
		}
		
		list.add(new AudioPlayer("Bob", "Stereo"));
		list.add(new MoviePlayer("Emma", "ScreenOfTruth"));
		
		try {
			pf.writeFile(list);
		}
		catch(IOException ioe) {
			System.err.println(ioe);
		}
		
		in.close();
	}
}
