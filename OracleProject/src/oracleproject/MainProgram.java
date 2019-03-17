package oracleproject;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		
		// 1 - add a new product
		// 2 - display the collection
		// 3 - show statistics
		// 4 - close the program
		// else read again
		
		int apnum=0, mpnum=0, pnum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Type 1 to add a new product" + "\nType 2 to display the collection"
				+ "\nType 3 to show statistics" + "\nType 4 to end the program");
		int n = in.nextInt();

		ArrayList<Product> products = new ArrayList<>();

		while (n != 4) {
			switch (n) {
			case 1: {
				System.out.println("\nType 1 to add an audio player\nType 2 to add a movie player");
				int t = in.nextInt();
				if (t == 1) {
					System.out.println("\nInput name and audio specification");
					AudioPlayer ap = new AudioPlayer(in.next(), in.next());
					products.add(ap);
					apnum++;
					pnum++;
				}
				else if (t == 2) {
					System.out.println("\nInput name and screen type");
					MoviePlayer mp = new MoviePlayer(in.next(), in.next());
					products.add(mp);
					mpnum++;
					pnum++;
				} else System.out.println("\nYou chose wrong.");
				break;
			}
			case 2: {
				for (Product p : products) {
					System.out.println(p);
					System.out.println("\n\n");
				}
				break;
			}
			case 3: {
				System.out.println("\nNumber of audio players: " + apnum);
				System.out.println("Number of movie players: " + mpnum);
				System.out.println("Number of all products: " + pnum);
				break;
			}
			}

			System.out.println("\n\n\nType 1 to add a new product" + "\nType 2 to display the collection"
					+ "\nType 3 to show statistics" + "\nType 4 to end the program");
			n = in.nextInt();
		}
		in.close();
	}
}
