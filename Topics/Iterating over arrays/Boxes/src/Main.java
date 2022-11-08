import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(box1);
        Arrays.sort(box2);

        boolean box1Mniejszy = false;
        boolean box2Mniejszy = false;
        for(int i = 0; i < box1.length; i++){
            if(box1[i] < box2[i]) box1Mniejszy = true;
            else { box1Mniejszy = false; break;}
        }

        for(int i = 0; i < box1.length; i++){
            if(box1[i] > box2[i]) box2Mniejszy = true;
            else { box2Mniejszy = false; break;}
        }

        if(box1Mniejszy && !box2Mniejszy) System.out.println("Box 1 < Box 2");
        else if (!box1Mniejszy && box2Mniejszy) {
            System.out.println("Box 1 > Box 2");
        } else if (!box1Mniejszy & !box2Mniejszy) {
            System.out.println("Incompatible");
        }else System.out.println("Blad");
    }
}