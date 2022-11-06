import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int tabelSize = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int checkLiczba1 = scanner.nextInt();
        int checkLiczba2 = scanner.nextInt();
        boolean check = false;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == checkLiczba1 && arr[i+1] == checkLiczba2) { check = true; break;}
            if(arr[i] == checkLiczba2 && arr[i+1] == checkLiczba1) { check = true; break;}
        }

        System.out.println(check);
    }
}