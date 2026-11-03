import java.util.Scanner;

public class Labssheet1Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (0 for false, non-zero for true): ");
        int val1 = sc.nextInt();
        System.out.print("Enter second integer (0 for false, non-zero for true): ");
        int val2 = sc.nextInt();
        System.out.print("Enter logical operator (& for AND, | for OR, ^ for XOR): ");
        char op = sc.next().charAt(0);

        boolean b1 = val1 != 0;
        boolean b2 = val2 != 0;

        if (op == '&') {
            System.out.println("Result: " + (b1 && b2));
        } else if (op == '|') {
            System.out.println("Result: " + (b1 || b2));
        } else if (op == '^') {
            System.out.println("Result: " + (b1 ^ b2));
        } else {
            System.out.println("Invalid logical operator.");
        }
    }
}
