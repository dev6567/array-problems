import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            double sal = sc.nextDouble();
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) { i--; continue; }
            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = yearsOfService[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println(totalBonus + " " + totalOldSalary + " " + totalNewSalary);
    }
}
