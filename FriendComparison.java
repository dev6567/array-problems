import java.util.Scanner;
public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }
        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
    }
}
