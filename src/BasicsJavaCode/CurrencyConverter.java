package BasicsJavaCode;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in Indian Rupees: ");
        double rupees = scanner.nextDouble();

//        Conversion Indian rupees to USD
        double conversionRate = 0.011;

        double usd = rupees * conversionRate;
        System.out.println("Your amount in USD is:" + " " + usd);
        scanner.close();
    }
}
