import java.util.Scanner;

public class Labssheet1Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
