//https://users.iit.uni-miskolc.hu/~vargae/Protected/OOP/2018/gyak_03.pdf gyakorlatai.
//BD
package thirdPracticeLecture.bekelabs;

import java.util.Random;
import java.util.Scanner;

public class ThirdMain {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("What do you want to try ? (Enter the number of the problem)");
        int code = sc1.nextInt();
        switch (code) {
            case 1:
                Calculators();
                break;

            case 2:
                GeometricMeanCalculator();
                break;

            case 3:
                RandomArray();
                break;
            case 4:
                QECalculators();
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

    public static void Calculators() {
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your input method:"
                + "\n 1. Three arguments"
                + "\n 2. One  argument");
        String calculatorType = scanner.next();
        switch (calculatorType) {
            case "1":
                result = calculateWithThreeArguments();
                break;

            case "2":
                result = calculateWithOneArgument();
                break;
            default:
                System.out.println("Please enter a valid calculation type");
                break;
        }

        System.out.println(result);
        Chocice();
        scanner.close();
    }

    public static double calculateWithThreeArguments() {
        double result = 0, firstOperand = 0, secondOperand = 0;
        String operator = "1";

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter your first operand");

        firstOperand = scanner1.nextDouble();

        System.out.println("Please enter your second operand");

        secondOperand = scanner1.nextDouble();

        System.out.println("Please enter your operator! (+,-,*,/)");

        operator = scanner1.next();

        result = calculate(firstOperand, secondOperand, operator);

        return result;

    }

    public static double calculateWithOneArgument() {

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter your calculation like this | '1 + 2' | !");
        String calculation = scanner2.nextLine();

        double firstOperand = Double.parseDouble(calculation.split(" ")[0]);
        double secondOperand = Double.parseDouble(calculation.split(" ")[2]);

        String operator = calculation.split(" ")[1];
        System.out.println(operator);
        double result = calculate(firstOperand, secondOperand, operator);

        return result;
    }

    public static double calculate(double firstOperand, double secondOperand, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;

            case "-":
                result = firstOperand - secondOperand;
                break;

            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    System.out.println("Can't divide with 0");
                    result = calculate(firstOperand, secondOperand + 1, operator);
                }

            default:
                System.out.println("Please enter a valid operator!");

        }
        return result;
    }

    public static void GeometricMeanCalculator() {
        double[] array = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 10 number and I will calculate the mean!");

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+". number");
            array[i] = scanner.nextDouble();
        }

        double mean = calculateMean(array);
        System.out.println("The mean: "+mean);
        Chocice();
    }

    private static double calculateMean(double[] array) {
        double mean = 1;

        for (double d : array) {
            mean *= d;
        }
        System.out.println(Math.pow(mean, 1 / array.length));
        mean = Math.pow(mean, 1.0 / array.length);
        //System.out.println(mean);
        return mean;
    }

    public static void RandomArray() {
        Random random= new Random();


        int [] randomArray= new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i]=random.nextInt(50)+1;

        }

        int [] randomArray2= new int[10];
        for (int i = 0; i < randomArray2.length; i++) {
            randomArray2[i]=(int)(Math.random()*50)+1;

        }
        System.out.println("First Array:");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
        System.out.println("\n \n");
        System.out.println("Second Array:");
        for (int i : randomArray2) {
            System.out.println(i);
        }
        System.out.println("\n \n");
        System.out.println("Reversed printout:");
        for (int i = randomArray.length-1; i >= 0; i--) {
            System.out.println(randomArray[i]);

        }

        searchMaxEvenNumber(randomArray, randomArray2);
        Chocice();
    }
    private static void searchMaxEvenNumber(int[] randomArray, int[] randomArray2) {
        double max=0;

        System.out.println("Init max : "+max);
        for (int i : randomArray) {
            if ((i%2==0) && (i>max)) {
                max=i;
            }
        }
        System.out.println("First array max : "+max);
        max=0;
        for (int i = 0; i < randomArray2.length; i++) {
            if (randomArray2[i]%2 ==0 && randomArray2[i]>max) {
                max=randomArray2[i];
            }
        }
        System.out.println("Second array max : "+max);

    }

    public static void QECalculators() {
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your input method:"
                + "\n 1. Three arguments"
                + "\n 2. One  argument");
        String calculatorType = scanner.next();
        switch (calculatorType) {
            case "1":
                QEcalculateWithThreeArguments();
                break;

            case "2":
                QEcalculateWithOneArgument();
                break;
            default:
                System.out.println("Please enter a valid calculation type");
                break;
        }

        System.out.println(result);
        scanner.close();
    }

    public  static void QEcalculateWithThreeArguments(){
    double constant = 0, firstOperand = 0, secondOperand = 0;


    Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter your first operand");

         firstOperand = scanner1.nextDouble();

        System.out.println("Please enter your second operand");

        secondOperand = scanner1.nextDouble();

        System.out.println("Please enter your constant");

        constant = scanner1.nextDouble();

        quadraticEquation(firstOperand, secondOperand, constant);

        scanner1.close();
        return;
}

    public static void QEcalculateWithOneArgument() {

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter your calculation like this | '2,5,6' | !");

        String calculation = scanner2.nextLine();

        double firstOperand = Double.parseDouble(calculation.split(",")[0]);
        double secondOperand = Double.parseDouble(calculation.split(",")[1]);
        double thirdOperand = Double.parseDouble(calculation.split(",")[2]);
        System.out.println(firstOperand+"\n"+secondOperand+"\n"+thirdOperand+"\n");
        quadraticEquation(firstOperand, secondOperand, thirdOperand);

        return;
    }
    private static void quadraticEquation(double firstOperand, double secondOperand, double constant) {
        double a=0,b=0,c=0;
         a = firstOperand;
         b = secondOperand;
         c = constant;

        double root1=0, root2=0;

        double determinant = (b * b) - (4 * a * c);

        if (determinant > 0) {
            root1 = ((-1)*b + Math.sqrt(determinant)) / (2 * a);
            root2 = ((-1)*b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("First root: "+ root1 + "\n "+ "Second root : "+root2);
        }

        else if (determinant == 0) {
            root1 = ((-1)*b) / (2 * a);

            System.out.println("The two roots are equal : " +root1);
        }

        else {
            double realPart = ((-1)*b) / (2 * a);
            double imaginaryPart = Math.sqrt((-1)*determinant) / (2 * a);

            System.out.println("First complex root: " + realPart + " + " + imaginaryPart + "i"
                    + " Second complex root: " + realPart + " - " + imaginaryPart + "i");
        }
        Chocice();
    }
}
