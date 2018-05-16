package bekelabs.RPS;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		char quit = 0;
		while (quit != 'I') {
			game.play();
			System.out.println("Ha szeretnél kilépni irj igent,további játékhoz egy bármilyen karaktert!");
			quit = sc.nextLine().toUpperCase().charAt(0);
		}
		sc.close();
		game.displayStats();
	}
}
