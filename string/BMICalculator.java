import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[][] {
            { String.format("%.2f", heightCm), String.format("%.2f", weight),
              String.format("%.2f", bmi), status }
        };
    }

    public static String[][] processTeam(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[][] bmiInfo = calculateBMI(data[i][0], data[i][1]);
            for (int j = 0; j < 4; j++) {
                result[i][j] = bmiInfo[0][j];
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        String[][] result = processTeam(teamData);
        displayTable(result);
    }
}
