import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int i = Integer.valueOf(scanner.nextLine());

        for ( ; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
