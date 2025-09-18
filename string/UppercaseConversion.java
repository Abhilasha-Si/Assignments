import java.util.Scanner;

public class UppercaseConversion {

    public static String toUpperCaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to convert to uppercase: ");
        String text = sc.nextLine();

        String upperCustom = toUpperCaseUsingCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Uppercase (custom method): " + upperCustom);
        System.out.println("Uppercase (built-in method): " + upperBuiltIn);

        boolean isEqual = compareStrings(upperCustom, upperBuiltIn);
        System.out.println("Are both uppercase conversions equal? " + isEqual);
    }
}
