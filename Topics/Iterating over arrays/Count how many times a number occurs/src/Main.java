import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        ArrayList<Integer> listaLiczb = new ArrayList<>();
        for(int i = 0; i < ilosc; i++){
            listaLiczb.add(scanner.nextInt());
        }
        int liczbaCheck = scanner.nextInt();

        ilosc = 0;
        for (int numer:listaLiczb) {
            if(numer == liczbaCheck) ilosc++;
        }

        System.out.println(ilosc);
    }
}