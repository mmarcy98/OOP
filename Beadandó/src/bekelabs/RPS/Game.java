package bekelabs.RPS;

public class Game extends GameItems {
	private Player player;
	private CP computer;
	private choices playerChoice;
	private choices computerChoice;
	private result result;
	private static int wins = 0, loses = 0, ties = 0;

	public Game() {
		super();
		player = new Player();
		computer = new CP();
	}

	public void play() {
		playerChoice = player.getPlayerChoice();
		computerChoice = computer.getCpChoice();
		result = getResults();
		stats();
		displayResults();
	}

	public void displayStats() {
		System.out.println((wins + loses + ties) + "db játék volt");
		System.out.println(wins + "db meccset nyertél");
		System.out.println(loses + " db meccset vesztettél");
		System.out.println(ties + "db döntetlen lett");
	}

	public result getResults() {
		if (playerChoice.equals(computerChoice))
			return GameItems.result.Döntetlen;

		switch (playerChoice) {
		case Kõ:
			return (computerChoice.equals(choices.Olló) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		case Papír:
			return (computerChoice.equals(choices.Kõ) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		case Olló:
			return (computerChoice.equals(choices.Papír) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		}
		return GameItems.result.Vesztett; // Soha nem ér el idáig a program.
	}

	private void stats() {
		if (result.equals(GameItems.result.Nyert))
			wins++;
		else if (result.equals(GameItems.result.Vesztett))
			loses++;
		else
			ties++;
	}

	private void displayResults() {
		switch (result) {
		case Nyert:
			System.out.println(playerChoice + " erõsebb mint a(z) " + computerChoice + " a játékos nyert");
			break;
		case Vesztett:
			System.out.println(playerChoice + " gyengébb mint a(z) " + computerChoice + " a gép nyert");
			break;
		case Döntetlen:
			System.out.println("Döntetlen");
			break;
		}
	}
}
