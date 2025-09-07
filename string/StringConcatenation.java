import java.util.Scanner;

public class StringConcatenation {

    public static String concatenateUsingCharAt(String s1, String s2) {
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            result += s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result += s2.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        String concatenatedCustom = concatenateUsingCharAt(str1, str2);
        String concatenatedBuiltIn = str1.concat(str2);

        System.out.println("Concatenated string (custom method): " + concatenatedCustom);
        System.out.println("Concatenated string (built-in method): " + concatenatedBuiltIn);
    }
}
