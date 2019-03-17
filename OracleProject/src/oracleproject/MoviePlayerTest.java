package oracleproject;


public class MoviePlayerTest {

	public static void main(String[] args) {
	
		MoviePlayer mp = new MoviePlayer("CoolPlayer", "CoolScreen");
		
		System.out.println(mp);
		System.out.println("\nMedia controls:");
		mp.play();
		mp.stop();
		mp.previous();
		mp.next();
	}

}
