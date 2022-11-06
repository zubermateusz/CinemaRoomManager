import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        scanner.nextLine();
        int[] companies = new int[ilosc];
        int[] incomes = new int[ilosc];

        for (int i = 0; i < ilosc; i++) {
            companies[i] = scanner.nextInt();
        }

        for (int i = 0; i < ilosc; i++) {
            incomes[i] = scanner.nextInt();
        }

        int companyPosition = 0;
        for (int i = 0; i < companies.length; i++) {
            if (incomes[i] * companies[i] >
                    incomes[companyPosition] * companies[companyPosition]) {
                companyPosition = i;
            }
        }

        System.out.println(companyPosition + 1);

    }

}
