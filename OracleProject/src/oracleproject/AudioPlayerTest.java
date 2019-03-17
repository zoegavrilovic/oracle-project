package oracleproject;

public class AudioPlayerTest {

	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer("Mp4", "Stereo");
		System.out.println(ap);
		
		System.out.println("\nMedia controls:");
		ap.play();
		ap.stop();
		ap.previous();
		ap.next();
	}

}
