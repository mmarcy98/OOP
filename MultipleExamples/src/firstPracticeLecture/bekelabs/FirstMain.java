package firstPracticeLecture.bekelabs;

import java.util.Scanner;

public class FirstMain {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("What do you want to try ? (Enter the number of the problem)");
		System.out.println(" 1:HelloWorld! \n 2:Bumm! \n ");
		int code = sc1.nextInt();

		switch (code) {
		case 1:
			HelloWorld();
			break;

		case 2:
			Bumm();
			break;

		default:
			System.out.println("Invalid number");
			Chocice();

		}
		sc1.close();

	}
	public static void Chocice() {
		Scanner sc = new Scanner(System.in);
		String Choice="0";
		System.out.println("If you want to try the other programs write 'yes' ");
		Choice = sc.nextLine();

		if (Choice.toLowerCase().equals("yes")) {
			main(null);
		} else {
			System.out.println("Mostly made by Daniel Beke ");
		}
		sc.close();
		return;

	}

	public static void HelloWorld() {
		System.out.println("Hello World");
		Chocice();
	}

	public static void Bumm() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Bumm");
		Chocice();
	}
}
