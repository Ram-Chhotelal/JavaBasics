package BasicsJavaCode;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Ask the user for Principal, Time and Rate
        System.out.println("Enter the principal amount (P):");
        double principal = scanner.nextDouble();

        System.out.println("Enter the time (T) in years:");
        double time = scanner.nextDouble();

        System.out.println("Enter the rate of interest (R):");
        double rate = scanner.nextDouble();
//        Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

//        Print the simple interest.
        System.out.println("The simple interest is" + " " + simpleInterest);

//        Close the scanner
        scanner.close();
    }
}
