import java.util.Scanner;

public class StringReverser {

    public static String reverseString(String text) {
        String reversed = "";
        int length = text.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String text = sc.nextLine();

        String reversedText = reverseString(text);

        System.out.println("Reversed string: " + reversedText);
    }
}
