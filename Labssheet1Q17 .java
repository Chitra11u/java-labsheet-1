import java.util.Scanner;

public class Labssheet1Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = (int) (temp / 10);
        }

        if (num == rev) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }
}
