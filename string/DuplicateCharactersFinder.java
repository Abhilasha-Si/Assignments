import java.util.Scanner;

public class DuplicateCharactersFinder {

    public static String findDuplicates(String text) {
        String duplicates = "";
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (text.indexOf(currentChar) != i && duplicates.indexOf(currentChar) == -1) {
                duplicates += currentChar;
            }
        }

        return duplicates.isEmpty() ? "No duplicates found" : duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to find duplicate characters: ");
        String text = sc.nextLine();

        String duplicates = findDuplicates(text);

        System.out.println("Duplicate characters: " + duplicates);
    }
}
