package bekelabs.RPS;

import java.util.Scanner;

public class Player extends GameItems {
	Scanner scanner;

	public Player() {
		super();
		scanner = new Scanner(System.in);
	}

	public choices getPlayerChoice() {
		System.out.println("Kérlek add meg hogy Kõ/Papír/Olló a választásod!");
		char playerChoice = scanner.nextLine().toUpperCase().charAt(0);
		switch (playerChoice) {
		case 'K':
			return choices.Kõ;
		case 'P':
			return choices.Papír;
		case 'O':
			return choices.Olló;
		}
		System.out.println("Hibás input!");
		return getPlayerChoice();
	}
}
