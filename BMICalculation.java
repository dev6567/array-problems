import java.util.Scanner;
public class BMICalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = bmi[i] < 18.5 ? "Underweight" :
                        bmi[i] < 24.9 ? "Normal" :
                        bmi[i] < 29.9 ? "Overweight" : "Obese";
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}
