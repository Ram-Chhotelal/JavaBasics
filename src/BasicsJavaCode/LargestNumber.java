package BasicsJavaCode;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Largest number is" + " " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number is" + " " + num2);
        }else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}
