import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);


        int steps = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int triples = 0;
        for(int i = 0; i < arr.length -2; i++){
            if((arr[i+1] == arr[i] + 1) && (arr[i+2] == arr[i] + 2)) triples++;
        }

        System.out.println(triples);



    }
}