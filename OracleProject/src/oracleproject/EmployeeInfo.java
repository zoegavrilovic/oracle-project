package oracleproject;
import java.util.Scanner;
import java.util.regex.*;

public class EmployeeInfo {
	StringBuilder name;
	String code;
	String deptId;
	
	public EmployeeInfo() {
		setName();
		createEmployeeCode(this.name);
		setDeptId();
	}
	
	Pattern p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
	
	Scanner in = new Scanner(System.in);
	
	public String getDeptId() {
		System.out.println("Enter ID: ");
		return in.nextLine();
	}
	public void setDeptId() {
		String Id = getDeptId();
		if(validId(Id))
			this.deptId = reverseString(Id);
		else this.deptId = "None01";
	}
	
	private boolean validId(String deptId) {
		Matcher matcher = p.matcher(deptId);
		if(!matcher.matches()) {
			return false;
		}return true;
	}
		
	public StringBuilder getName() {
		return name;
	}	
	public void setName() {
		this.name = new StringBuilder(inputName());
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	private boolean checkName(StringBuilder name) {
		for(int i = 0; i < name.length();i++) {
			if(name.charAt(i) == ' ') 
				return true;
		}
		return false;
	}
	public void createEmployeeCode(StringBuilder name)
	{
		if(checkName(name)) {
			for(int i = 0; i < name.length();i++) {
				if(name.charAt(i) == ' ') {
					this.code = name.charAt(0)+name.substring(i+1, name.length());
				}
			}
		} else this.code ="Guest";
	}
	
	private String inputName() {
		System.out.println("Input name: ");
		return in.nextLine();
	}

	public String reverseString(String deptId) {
		if (deptId.length() == 1) {
	           return deptId;
	       }
	    return reverseString(deptId.substring(1)) + deptId.charAt(0);
	}
	
	@Override
	public String toString() {
		return ("Code\t: " + code + "\nId\t: " + deptId);
	}
}
