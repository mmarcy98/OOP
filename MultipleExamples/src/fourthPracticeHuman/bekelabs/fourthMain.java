package fourthPracticeHuman.bekelabs;

import java.util.Scanner;

public class fourthMain {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Human Test = new Human();
    System.out.println("Add meg a nevet!");
    Test.setName(scanner.nextLine());
    System.out.println("Mennyi a tömeged?");
    Test.setWeight(scanner.nextInt());
    System.out.println("Milyen magas vagy méterben?");
    Test.setHeight(scanner.nextDouble());
    System.out.println(Test.getData());
}
}
