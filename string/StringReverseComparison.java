import java.util.Scanner;

public class StringReverseComparison {

    public static String reverseUsingCharAt(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String text = sc.next();

        String reversedCustom = reverseUsingCharAt(text);
        String reversedBuiltIn = new StringBuilder(text).reverse().toString();

        System.out.println("Reversed (custom method): " + reversedCustom);
        System.out.println("Reversed (built-in method): " + reversedBuiltIn);

        boolean areEqual = reversedCustom.equals(reversedBuiltIn);
        System.out.println("Are both reversals equal? " + areEqual);
    }
}
