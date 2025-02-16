package BasicsJavaCode;

import java.util.Scanner;

public class HCF_LCM_Calculator {
    public static int findHCF (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b, int hcf) {
        return (a * b)/hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);

        int lcm = findLCM(num1, num2, hcf);

        System.out.println("HCF=" + hcf);
        System.out.println("LCM=" + lcm);
        scanner.close();
    }
}

