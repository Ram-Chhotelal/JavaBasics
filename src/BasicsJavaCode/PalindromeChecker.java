package BasicsJavaCode;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a String:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a Palindrome" );
        }else {
            System.out.println("'" + input + "' is not a Palindrome");
        }
        scanner.close();
    }
    public static boolean isPalindrome (String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = str.length();

        for (int i = 0; i<length/2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
