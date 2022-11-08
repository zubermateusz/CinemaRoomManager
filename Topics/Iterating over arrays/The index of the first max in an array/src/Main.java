import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tableSize = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[index] < arr[i]) index = i;
        }

        System.out.println(index);
    }
}