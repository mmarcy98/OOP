package secondPracticeLecture.bekelabs;

import java.util.Random;
import java.util.Scanner;

/*
 https://users.iit.uni-miskolc.hu/~vargae/Protected/OOP/2018/gyak_02.pdf gyakorlatai
*/
public class SecondMain {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

        System.out.println("What do you want to try ? (Enter the number of the problem)");
		int code = sc1.nextInt();
		switch (code) {
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
			Array();
			break;
		case 5:
			numberStairs();
			break;
		case 6:
			eulerNumber();
			break;
		case 7:
			//PitagoralNumbers();
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
	
	private static void estiminatePi() // 1
	{
		int n = 1000;
		double result = 0.0, numerator, denominator, flag = -1.0;

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
		int sum = 1;
		for (int i = 1; i < z; i++) {
			sum += sum * i;
		}
		return sum;
		// System.out.print("Faktorial: "+sum);
		
	}

	private static void eulerNumber()
	{
		double denominator = 0, sum = 0;
		int Stop = 10; // Can't set to 100.
		for (int n = 0; n <= Stop; n++) {
            denominator = factorial(n);
			sum += 1 / denominator;
		}
		// System.out.println("Factorial: " + denominator);
		System.out.println("Euler number: " + sum);
		Chocice();
	}

	private static boolean isPrime(int n)
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

		int p = 1;// Lowend
		int q = 100;// Highend
		int sum = 0;
		for (int i = p; i <= (q - 2); i++) {
			if (isPrime(i) == true && isPrime(i + 2) == true) {
				sum += 1;
				System.out.println("(" + i + "," + (i + 2) + ") ");
			}

		}
		System.out.println("There are : "+ sum +" twinprime");
		Chocice();
	}
	private static void Array()
    {
	 int[] array= {0,0,0,0,0,0,0,0,0};
	 Random randomizer = new Random();

		System.out.println("Initial Array: ");
		for (int i = 0; i < array.length; i++) {
		array[i]=randomizer.nextInt(100)+1;
		System.out.println(array[i]);
	}

	int value=array[0];

		System.out.println("Linear Search result: "+linearSearch(value,array));

	int[] sortedArray=sort(array);

		System.out.println("Sorted Array:");
		for (int i : sortedArray) {
		System.out.println(i);
	}

		System.out.println("Binary Search result:"+binarySearch(value,sortedArray,0,array.length));

        Chocice();
}

	private static int linearSearch(int value, int[] array) {


		for (int i = 0; i < array.length; i++) {
			if(array[i]==value)
				return i;
		}
		return -1;
	}


	private static int[] sort(int [] array) {



		int min=0;
		for (int i = 0; i < array.length; i++) {
			min=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min]>array[j])
					min=j;
			}
			if (min!=i) {
				int temp=array[i];
				array[i]=array[min];
				array[min]=temp;
			}
		}
		return array;
	}


	private static int binarySearch(int searchedValue, int array[], int startValue, int endValue)
	{
		if (endValue>=startValue)
		{
			int midValue = startValue + (endValue - startValue)/2;

			if (array[midValue] == searchedValue)
				return midValue;

			if (array[midValue] > searchedValue)
				return binarySearch(searchedValue, array, startValue, midValue-1 );

			return binarySearch(searchedValue, array, midValue+1, endValue );
		}

		return -1;
	}
	
}

