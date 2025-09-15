import java.util.Scanner;

public class Multiplication6to9Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4]; // 6,7,8,9

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}
