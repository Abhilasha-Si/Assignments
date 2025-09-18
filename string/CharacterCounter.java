import java.util.Scanner;

public class CharacterCounter {

    public static int countCharacter(String text, char target) {
        int count = 0;
        int length = text.length();

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char target = sc.next().charAt(0);

        int occurrences = countCharacter(text, target);

        System.out.println("Character '" + target + "' occurred " + occurrences + " times in the string.");
    }
}
