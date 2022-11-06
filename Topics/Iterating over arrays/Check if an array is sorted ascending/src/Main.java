import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arrTemp = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrTemp[i]) {
                check = false;
            }
        }

        if (check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
