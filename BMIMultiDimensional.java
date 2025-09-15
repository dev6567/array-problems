import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) { i--; continue; }
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            weightStatus[i] = personData[i][2] < 18.5 ? "Underweight" :
                              personData[i][2] < 24.9 ? "Normal" :
                              personData[i][2] < 29.9 ? "Overweight" : "Obese";
            System.out.println(height + " " + weight + " " + personData[i][2] + " " + weightStatus[i]);
        }
    }
}
