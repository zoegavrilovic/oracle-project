package oracleproject;

//import java.util.ArrayList;
//import java.util.Comparator;

public class MoviePlayer extends Product implements MultimediaControl,Comparable<MoviePlayer> {
	private String screen;
	private MonitorType monitorType;
	
	//static ArrayList<MoviePlayer> moviePlayers = new ArrayList<MoviePlayer>();

	public MoviePlayer() {}
	public MoviePlayer(String name, String screen) {
		super(name);
		this.screen = screen;
		this.monitorType = MonitorType.LED;
	}

	@Override
	public void play() {
		System.out.println("Playing");
	}

	@Override
	public void stop() {
		System.out.println("Stopped");
	}

	@Override
	public void previous() {
		System.out.println("Playing previous");
	}

	@Override
	public void next() {
		System.out.println("Playing next");
	}
	
	public int compareTo(MoviePlayer mp) {
		if(getName().compareTo(mp.getName()) < 0) return -1;
			if(getName().compareTo(mp.getName()) == 0) return 0;
		return 1;
	}
	
	@Override 
	public String toString() {
		return (super.toString() + "\nScreen\t\t: " + screen
				+ "\nMonitor Type\t: " + monitorType);
	}
}
