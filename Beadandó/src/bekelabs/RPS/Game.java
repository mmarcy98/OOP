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
		System.out.println((wins + loses + ties) + " db j�t�k volt");
		System.out.println(wins + " db meccset nyert�l");
		System.out.println(loses + " db meccset vesztett�l");
		System.out.println(ties + " db d�ntetlen lett");
	}

	public result getResults() {
		if (playerChoice.equals(computerChoice))
			return GameItems.result.D�ntetlen;

		switch (playerChoice) {
		case K�:
			return (computerChoice.equals(choices.Oll�) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		case Pap�r:
			return (computerChoice.equals(choices.K�) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		case Oll�:
			return (computerChoice.equals(choices.Pap�r) ? GameItems.result.Nyert : GameItems.result.Vesztett);
		}
		return GameItems.result.Vesztett; // Soha nem �r el id�ig a program.
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
			System.out.println(playerChoice + " er�sebb mint a(z) " + computerChoice + " a j�t�kos nyert");
			break;
		case Vesztett:
			System.out.println(playerChoice + " gyeng�bb mint a(z) " + computerChoice + " a g�p nyert");
			break;
		case D�ntetlen:
			System.out.println("D�ntetlen");
			break;
		}
	}
}
