import java.util.Scanner;

public class Labssheet1Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage.");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage.");
            }
        } else {
            System.out.println("Invalid gender entered.");
        }
    }
}
