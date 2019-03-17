package oracleproject;

import java.util.Date;

public interface Item {
	public String manufacturer = "OracleProduction";
	public void setProductionNumber(int productionNumber);
	public void setName(String name);
	public String getName();
	public Date getManufacturerDate();
	public int getSerialNumber();
}
