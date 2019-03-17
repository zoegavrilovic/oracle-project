package oracleproject;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public static void print(ArrayList<? extends Product> list) {
		for(Product p : list) {
			System.out.println(p);
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		
		ArrayList<MoviePlayer> moviePlayers = new ArrayList<MoviePlayer>();

		MoviePlayer moviePlayer1 = new MoviePlayer("CPlayer", "Screen1");
		MoviePlayer moviePlayer2 = new MoviePlayer("BPlayer", "Screen2");
		MoviePlayer moviePlayer3 = new MoviePlayer("APlayer", "Screen3");
		moviePlayers.add(moviePlayer1);
		moviePlayers.add(moviePlayer2);
		moviePlayers.add(moviePlayer3);
		print(moviePlayers);
		Collections.sort(moviePlayers);
		System.out.println("Sorted:\n");
		print(moviePlayers);
		
		ArrayList<AudioPlayer> audioPlayers = new ArrayList<AudioPlayer>();
		
		AudioPlayer audioPlayer1 = new AudioPlayer("FPlayer", "Stereo");
		AudioPlayer audioPlayer2 = new AudioPlayer("EPlayer", "Mono");
		AudioPlayer audioPlayer3 = new AudioPlayer("DPlayer", "Mono");
		audioPlayers.add(audioPlayer1);
		audioPlayers.add(audioPlayer2);
		audioPlayers.add(audioPlayer3);
		print(audioPlayers);
		Collections.sort(audioPlayers);
		System.out.println("Sorted:\n");
		print(audioPlayers);
		
	}

}
