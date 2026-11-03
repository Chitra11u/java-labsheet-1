import java.util.Scanner;

public class Labssheet1Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        if (num < 10) {
            System.out.println("Number of digits: 1");
        } else if (num < 100) {
            System.out.println("Number of digits: 2");
        } else if (num < 1000) {
            System.out.println("Number of digits: 3");
        } else if (num < 10000) {
            System.out.println("Number of digits: 4");
        } else if (num < 100000) {
            System.out.println("Number of digits: 5");
        } else {
            System.out.println("Number has more than 5 digits.");
        }
    }
}
