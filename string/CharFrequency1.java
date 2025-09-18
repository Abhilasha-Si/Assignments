import java.util.Scanner;

public class CharFrequency1 {

    public static String[][] charFrequencies(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencies = charFrequencies(text);

        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : frequencies) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }
}
