import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        int temp = number;

        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
