package oracleproject;

public enum ItemType {
	Audio("AU"),
	Visual("VI"),
	AudioMobile("AM"),
	VisualMobile("VM");
	
	private String title;
	
	private ItemType(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
