import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int integer = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while (i <= 10) {
            int increase = i++;
            int multiply = increase * integer;
            System.out.println(integer + " x " + increase + " = " + multiply);

        }
    }
}