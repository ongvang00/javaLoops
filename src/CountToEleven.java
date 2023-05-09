import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int integer = Integer.valueOf(scanner.nextLine());

        int i = 1;
        while (i < 11) {
            System.out.println(integer + i);
            i++;

        }
    }
}
