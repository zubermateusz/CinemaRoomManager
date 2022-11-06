import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        int najmniejsza = scanner.nextInt();
        for( int i = 0; i < ilosc-1; i++){
            int tempLiczba = scanner.nextInt();
            if(najmniejsza > tempLiczba) najmniejsza = tempLiczba;
        }
        System.out.println(najmniejsza);
    }
}