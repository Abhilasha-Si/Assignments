import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);
            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + status[i]);
        }
    }
}
