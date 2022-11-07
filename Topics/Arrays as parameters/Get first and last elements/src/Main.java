import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] arr) {
        int[] arr2 = new int[2];
        arr2[0] = arr[0];
        arr2[1] = arr[arr.length - 1];
        return arr2;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}