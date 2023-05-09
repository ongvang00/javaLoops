import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number");
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer == 5) {
                break;
            }
        }
    }

}
