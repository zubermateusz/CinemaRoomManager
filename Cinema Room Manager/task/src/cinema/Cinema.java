package cinema;

import java.util.Scanner;

public class Cinema {

    private static String[][] room = new String[7][8];

    public static void main(String[] args) {
        // Write your code here
        //setSeats();  //zakomentowane do 2/5
        //showRoom();  //zakomentowane do 2/5

        int[] roomSize = askUserAboutSeats();
        totalIncame(roomSize[0], roomSize[1]);
    }

    private static void totalIncame(int rzedy, int siedzeniaWRzedzie) {
        int priceSmallRoom = 10;
        int priceFrontSeatsBigRoom = 10;
        int priceBeckSeatsBigRoom = 8;
        int sum = 0;
        if (rzedy * siedzeniaWRzedzie <= 60) {
            sum = rzedy * siedzeniaWRzedzie * priceSmallRoom;
        } else {
            sum = (rzedy / 2 * siedzeniaWRzedzie * priceFrontSeatsBigRoom) +
                    ((rzedy - (rzedy / 2)) * siedzeniaWRzedzie * priceBeckSeatsBigRoom);
        }
        System.out.println("Total income:\n$" + sum);
    }

    private static int[] askUserAboutSeats() {
        int[] roomSize = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        System.out.print("> "); // znacznik dla usera
        roomSize[0] = scanner.nextInt(); //wczytanie ilosci rzedow
        System.out.println("Enter the number of seats in each row:");
        System.out.print("> "); // znacznik dla usera
        roomSize[1] = scanner.nextInt(); // wczytanie ilosci miejsc w rzedzie
        return roomSize;
    }

    private static void setSeats() {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = "S";
            }
        }
    }

    private static void showRoom() {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8"); // wypisanie numeru kolumny
        for (int i = 0; i < room.length; i++) {
            System.out.print(i + 1 + " ");  //wstawienie numeru wiersza
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }

    }
}