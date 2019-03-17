package oracleproject;

import java.util.ArrayList;
import java.util.Date;

public class Product implements Item{
	private int serialNumber;
	private String manufacturer = "OracleProduction";
	private Date manufacturedOn;
	private String name;
	private static int currentProductionNumber = 1;
	
	@Override
	public void setProductionNumber(int productionNumber) {
		currentProductionNumber = productionNumber;	
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Date getManufacturerDate() {
		return manufacturedOn;
	}
	@Override
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public Product() {}
	
	public Product(String name) {
		this.name = name;
		this.serialNumber = currentProductionNumber;
		currentProductionNumber++;
		this.manufacturedOn = new Date();
	}
	
	public static void printType(ArrayList<? extends Product> list) {
		for(Product p : list) {
			System.out.println(p);
			System.out.println("\n");
		}
	}
	
	@Override
	public String toString() {
		return ("Manufacturer\t: " + manufacturer + "\nSerial Number\t: " + serialNumber 
				+ "\nDate\t\t: " + manufacturedOn + "\nName\t\t: " + name);
	}
	
}
