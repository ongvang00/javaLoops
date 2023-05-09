import java.util.Scanner;


public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int integer = Integer.valueOf(scanner.nextLine());
            System.out.println("Number is " + integer);

            if (integer < 0) {
                System.out.println("Number must be a positive number");
            }
            if (integer == 0) {
                break;
            }
        }
    }
}
