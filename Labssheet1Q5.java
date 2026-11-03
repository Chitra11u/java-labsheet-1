import java.util.Scanner;

public class Labssheet1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double original = sc.nextDouble();

        int converted = (int) original;

        System.out.println("Original Value: " + original);
        System.out.println("Converted Integer Value: " + converted);
    }
}
