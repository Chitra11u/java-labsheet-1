import java.util.Scanner;

public class Labssheet1Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        double tax = 0;

        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax = (salary - 250000) * 0.05;
        } else if (salary <= 1000000) {
            tax = (250000 * 0.05) + (salary - 500000) * 0.20;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (salary - 1000000) * 0.30;
        }

        System.out.println("Calculated Tax: " + tax);
    }
}
