package bekelabs.RPS;

import java.util.Scanner;

public class Player extends GameItems {
	Scanner scanner;

	public Player() {
		super();
		scanner = new Scanner(System.in);
	}

	public choices getPlayerChoice() {
		System.out.println("K�rlek add meg hogy K�/Pap�r/Oll� a v�laszt�sod!");
		char playerChoice = scanner.nextLine().toUpperCase().charAt(0);
		switch (playerChoice) {
		case 'K':
			return choices.K�;
		case 'P':
			return choices.Pap�r;
		case 'O':
			return choices.Oll�;
		}
		System.out.println("Hib�s input!");

		return getPlayerChoice();
	}
}
