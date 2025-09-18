import java.util.Scanner;

public class CharacterOccurrenceCounter {

    public static int countOccurrences(String text, char targetChar) {
        int count = 0;
        int length = text.length();

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter the character to count occurrences of: ");
        char targetChar = sc.next().charAt(0);

        int occurrenceCount = countOccurrences(text, targetChar);

        System.out.println("Character '" + targetChar + "' appears " + occurrenceCount + " times in the string.");
    }
}
