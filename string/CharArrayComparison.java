import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getChars(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        boolean isEqual = compareCharArrays(customChars, builtInChars);

        System.out.println("Custom char array: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.println("\nBuilt-in char array: ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println("\nAre char arrays equal: " + isEqual);
    }
}
