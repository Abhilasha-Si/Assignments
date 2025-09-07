import java.util.Scanner;

public class ToLowerCaseComparison {

    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String lowerUsingCharAt = toLowerCaseUsingCharAt(text);
        String lowerUsingBuiltIn = text.toLowerCase();

        System.out.println("Lowercase (charAt method): " + lowerUsingCharAt);
        System.out.println("Lowercase (built-in method): " + lowerUsingBuiltIn);

        boolean isSame = compareStrings(lowerUsingCharAt, lowerUsingBuiltIn);
        System.out.println("Are the results same? " + isSame);
    }
}
