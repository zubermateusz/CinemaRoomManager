import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[ilosc];
        arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isOrder = true;

        int nowy1 = scanner.nextInt();
        int nowy2 = scanner.nextInt();

        for (int i = 0; i < ilosc - 1; i++) {
            if ((arr[i] == nowy1 && arr[i + 1] == nowy2) || (arr[i] == nowy2 && arr[i + 1] == nowy1)) { 
                isOrder = false;
            }
        }

        System.out.println(isOrder);
    }
}
