import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        int sign;
        if (number > 0) {
            sign = 1;
        } else {
            if (number == 0) {
                sign = 0;
            } else {
                sign = -1;
            }
        }
        return sign;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}