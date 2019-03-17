package oracleproject;

//import java.util.ArrayList;
//import java.util.Comparator;

public class AudioPlayer extends Product implements MultimediaControl, Comparable<AudioPlayer>{
	private String audioSpecification;
	private ItemType mediaType;
	
	//static ArrayList<AudioPlayer> audioPlayers = new ArrayList<AudioPlayer>();
	
	public AudioPlayer() {}
	
	public AudioPlayer(String name, String audioSpecification) {
		super(name);
		this.audioSpecification = audioSpecification;
		this.mediaType = ItemType.Audio;
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
	
	public int compareTo(AudioPlayer ap) {
		if(getName().compareTo(ap.getName()) < 0) return -1;
			if(getName().compareTo(ap.getName()) == 0) return 0;
		return 1;	
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nAudio Spec\t: " + audioSpecification
				+ "\nMedia Type\t: " + mediaType);
	}
	
}
