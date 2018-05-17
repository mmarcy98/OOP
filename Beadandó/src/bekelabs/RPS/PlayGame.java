package bekelabs.RPS;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		char quit = 0;
		boolean isInvalid = true;
		do {
			try {
				if (quit != 'I' || quit != 'i') {
					game.play();
					System.out.println("Ha szeretnél kilépni irj igent,további játékhoz nyomj le egy karaktert!");
					quit = sc.nextLine().toUpperCase().charAt(0);
					isInvalid = false;
				}

			} catch (StringIndexOutOfBoundsException siobe) {
				System.out.println("Érvénytelen input!");
			}

		} while (isInvalid);
		sc.close();
		game.displayStats();
	}
}
