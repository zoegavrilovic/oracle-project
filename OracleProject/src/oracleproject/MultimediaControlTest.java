package oracleproject;

public class MultimediaControlTest {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		MoviePlayer moviePlayer = new MoviePlayer();
		
		System.out.println("Audio player multimedia controls:");
		audioPlayer.play();
		audioPlayer.stop();
		audioPlayer.previous();
		audioPlayer.next();
		System.out.println("\nMovie player multimedia controls:");
		moviePlayer.play();
		moviePlayer.stop();
		moviePlayer.previous();
		moviePlayer.next();
	}

}
