import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(true); 
        } else {
            System.out.println(false);
        }
    }
}
