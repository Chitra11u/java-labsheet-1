import java.util.Scanner;

public class Labssheet1Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        double a1 = sc.nextDouble();
        System.out.print("Enter angle 2: ");
        double a2 = sc.nextDouble();
        System.out.print("Enter angle 3: ");
        double a3 = sc.nextDouble();

        if (a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180)) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
    }
}
