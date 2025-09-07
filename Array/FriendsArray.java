import java.util.Scanner;

public class FriendsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();

        int minAge = ages[0], minIndex = 0;
        for (int i = 1; i < 3; i++) if (ages[i] < minAge) { minAge = ages[i]; minIndex = i; }

        int maxHeight = heights[0], maxIndex = 0;
        for (int i = 1; i < 3; i++) if (heights[i] > maxHeight) { maxHeight = heights[i]; maxIndex = i; }

        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println(names[minIndex] + " is youngest");
        System.out.println(names[maxIndex] + " is tallest");
    }
}
