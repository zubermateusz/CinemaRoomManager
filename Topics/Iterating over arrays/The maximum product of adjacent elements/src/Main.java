import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > max) {
                max = arr[i] * arr[i + 1];
            }
        }

        System.out.println(max);
    }
}