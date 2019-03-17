package oracleproject;

public class Screen implements ScreenSpec{
	private String resolution;
	private int refreshRate;
	private int responseTime;
	
	
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}
	public void setResponseTime(int responseTime) {
		this.responseTime = responseTime;
	}
	@Override
	public String getResolution() {
		return resolution;
	}
	@Override
	public int getRefreshRate() {
		return refreshRate;
	}
	@Override
	public int getResponseTime() {
		return responseTime;
	}
	
	@Override
	public String toString() {
		return ("Resolution\t: " + resolution + "\nRefresh Rate\t: " + refreshRate
				+ "Hz\nResponse Time\t: " + responseTime + "ms");
	}
}
