package oracleproject;

public class ScreenTest {

	public static void main(String[] args) {
		Screen s = new Screen();
		s.setResolution("800x600");
		s.setRefreshRate(60);
		s.setResponseTime(5);
		System.out.println(s);
	}

}
