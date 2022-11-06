import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < ilosc; i++){
            lista.add(scanner.nextInt());
        }

        int liczbaCheck = scanner.nextInt();

        boolean flag = false;
        for (Integer i: lista
             ) {
            if(i == liczbaCheck) flag = true;
        }

        System.out.println(flag);
    }
}