import java.util.Scanner;

public class NumberArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is positive and ");
                System.out.println((numbers[i] % 2 == 0) ? "even." : "odd.");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last numbers are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First number is greater than last number.");
        } else {
            System.out.println("First number is less than last number.");
        }
    }
}
