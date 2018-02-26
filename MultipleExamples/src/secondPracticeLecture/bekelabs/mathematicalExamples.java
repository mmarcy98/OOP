package secondPracticeLecture.bekelabs;

import java.util.Scanner;

import firstPracticeLecture.bekelabs.BasicExamples;

/*
 https://users.iit.uni-miskolc.hu/~vargae/Protected/OOP/2018/gyak_02.pdf gyakorlatai külön methodokban.
*/
public class mathematicalExamples {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Melyik feladatot szeretnéd kipróbálni?(a feladatszám a kódszáma,hf 6,7)");
		int Kod = sc1.nextInt();
		switch (Kod) {
		case 1:
			estiminatePi();
			break;

		case 2:
			factorialCalculator();
			break;

		case 3:
			TwinPrime();
			break;
		case 4:
			//System.out.println("A feladat nem lett még kidolgozva");
			break;
		case 5:
			numberStairs();
			break;
		case 6:
			eulerNumber();
			break;
		case 7:
			//eulerNumber();
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
	
	private static void estiminatePi() // 1
	{
		int n = 1000;
		double result = 0.0, numerator, denominator, flag = -1.0; // numerator-számláló,denominator-nevezõ

		for (int i = 0; i < n; i++) {
			numerator = Math.pow(flag, i);
			denominator = (2.0 * i + 1.0);
			result += (numerator / denominator);
		}
		System.out.println("Pi: " + result * 4);
		Chocice();
	}

	private static void factorialCalculator() // 2
	{
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < i; j++) {
				result += result * j;
			}

			System.out.println(i + "! =" + result);
			result = 1;
		}
		Chocice();
	}

	private static void numberStairs() // 5
	{
		for (int i = 0; i < 6; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		Chocice();
	}

	private static int factorial(int z) {
		int szum = 1;
		for (int i = 1; i < z; i++) {
			szum += szum * i;
		}
		return szum;
		// System.out.print("Faktorialis: "+szum);
		
	}

	private static void eulerNumber() // HF1
	{
		double proba = 0, szum = 0;
		int Stop = 10; // 100ig hibát dob,nem lehet tárolni.
		for (int n = 0; n <= Stop; n++) {
			proba = factorial(n);
			szum += 1 / proba;
		}
		// System.out.println("Factorial: " + proba);
		System.out.println("Euler szám: " + szum);
		Chocice();
	}

	static boolean isPrime(int n) // Prim e a szám.
	{
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

	private static void TwinPrime() // 3
	{

		int p = 1;// alsohatar
		int q = 100;// felsohatar
		int szum = 0;

		System.out.println("nThe Twin Prime Numbers within the given range are : ");
		for (int i = p; i <= (q - 2); i++) {
			if (isPrime(i) == true && isPrime(i + 2) == true) {
				szum += 1;
				System.out.println("(" + i + "," + (i + 2) + ") ");
			}

		}
		System.out.println(szum + "db ikerprim van");
		Chocice();
	}

	
}

// TODO :4+hf 2 hiányzik
