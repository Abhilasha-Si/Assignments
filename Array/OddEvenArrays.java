import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }
        int[] odds = new int[number / 2 + 1];
        int[] evens = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[evenIndex++] = i;
            else odds[oddIndex++] = i;
        }
        System.out.print("Odd: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odds[i] + " ");
        System.out.println();
        System.out.print("Even: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evens[i] + " ");
    }
}
