import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String text = sc.nextLine();

        boolean isPalindromeCustom = isPalindrome(text);
        boolean isPalindromeBuiltIn = text.equals(new StringBuilder(text).reverse().toString());

        System.out.println("Is palindrome (custom method)? " + isPalindromeCustom);
        System.out.println("Is palindrome (built-in reverse check)? " + isPalindromeBuiltIn);
    }
}
