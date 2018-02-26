package firstPracticeLecture.bekelabs;

import java.util.Scanner;

/*
	A program célja hogy az elsõ és második gyakorlaton megcsinált feladatokat egy osztályon belül,külön metódusokba szervezve 
 */

public class BasicExamples {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Milyen programrészt szeretnél kipróbálni?");
		System.out.println(" 1:HelloWorld! \n 2:Bumm! \n 3:Másodfokú egyenlet megoldóképlet");
		int Kod = sc1.nextInt();

		switch (Kod) {
		case 1:
			HelloWorld();
			break;

		case 2:
			Bumm();
			break;

		case 3:
			Masodfoku();
			break;

		default:
			System.out.println("Érvénytelen mûvelet!");

		}
		sc1.close();

	}

	public static void Chocice() {
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Ha szeretnél más programot kipróbálni akkor irj igent!");
		String Choice = sc2.nextLine();

		if (Choice.toLowerCase().equals("igen")) {
			main(null);
		} else {
			System.out.println("A programot készitette Beke Dániel");

		}
		sc2.close();
		return;
	}

	private static void HelloWorld() {
		System.out.println("Hello World");
		Chocice();
	}

	private static void Bumm() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Bumm");
		Chocice();
	}

	private static void Masodfoku() {
		// Kétféle kiiratást próbaképp,02.22. elõadáson tanultak alapján.

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Add meg a másodfokú tagot!");
		int a = sc3.nextInt();
		System.out.println("Add meg az elsõfokú tagot!");
		int b = sc3.nextInt();
		System.out.println("Add meg a konstans tagot!");
		int c = sc3.nextInt();

		double root1, root2;

		double determinant = (b * b) - (4 * a * c);

		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);

			System.out.format("Az egyik gyök = %.2f a másik gyök root2 = %.2f", root1, root2);
		}
		// Ha a két gyök egyenlõ
		else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);

			System.out.format("x1 = x2 = %.2f;", root1);
		}
		// Komplex gyökök
		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

			System.out.println("Az egyik komplex gyök: " + realPart + " + " + imaginaryPart + "i"
					+ " a másik komplex gyök: " + realPart + " - " + imaginaryPart + "i");
		}

		Chocice();
		sc3.close();
	}

}
