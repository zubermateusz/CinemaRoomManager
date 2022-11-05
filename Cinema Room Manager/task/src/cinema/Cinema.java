package cinema;

import java.util.Scanner;

public class Cinema {

    static int priceSmallRoom = 10;
    static int priceFrontSeatsBigRoom = 10;
    static int priceBeckSeatsBigRoom = 8;

    private static class Seat {
        String zajete;
        int cena;

    }


    public static void main(String[] args) {
        // Write your code here

        int[] roomSize = askUserAboutRoom(); // zapytanie o wielkosc sali
        Seat[][] room = new Seat[roomSize[0]][roomSize[1]]; // ustawienie siedzen i wielkosci sali
        setSeats(room);  // wypelnienie wszystkich siedzie 'S'
        setPrice(room); // ustawienie cen siedzen
        showRoom(room);  //wyswietlenie pustej sali

        int[] seat = askUserAboutSeat(); // zapytanie ktore miejsce kupic
        ticketPrice(seat, room);
        showRoom(room);
        //totalIncame(room);
    }

    private static void ticketPrice(int[] seat, Seat[][] room) {
        System.out.println("Ticket price: $" + room[seat[0] - 1][seat[1] - 1].cena);
        System.out.println();
        room[seat[0] - 1][seat[1] - 1].zajete = "B";
    }

    private static void setPrice(Seat[][] room) {
        int rzedy = room.length;
        int miejscaWRzedzie = room[0].length;

        if (rzedy * miejscaWRzedzie <= 60) {
            for (int i = 0; i < room.length; i++) {
                for (int j = 0; j < room[i].length; j++) {
                    room[i][j].cena = priceSmallRoom;
                }
            }
        } else {
            for (int i = 0; i < room.length / 2; i++) {
                for (int j = 0; j < room[i].length; j++) {
                    room[i][j].cena = priceFrontSeatsBigRoom;
                }
            }

            for (int i = room.length / 2; i < room.length; i++) {
                for (int j = 0; j < room[i].length; j++) {
                    room[i][j].cena = priceBeckSeatsBigRoom;
                }
            }
        }
    }

    private static int[] askUserAboutSeat() {
        int[] seat = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        System.out.print("> "); // znacznik dla usera
        seat[0] = scanner.nextInt(); //wczytanie rzad miejsca
        System.out.println("Enter a seat number in that row:");
        System.out.print("> "); // znacznik dla usera
        seat[1] = scanner.nextInt(); // wczytanie numeru miejsca
        System.out.println();
        return seat;
    }

    private static void totalIncame(Seat[][] room) {
        int sum = 0;
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                sum += room[i][j].cena;
            }
        }
        System.out.println("Total income:\n$" + sum);
    }

    private static int[] askUserAboutRoom() {
        int[] roomSize = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        System.out.print("> "); // znacznik dla usera
        roomSize[0] = scanner.nextInt(); //wczytanie ilosci rzedow
        System.out.println("Enter the number of seats in each row:");
        System.out.print("> "); // znacznik dla usera
        roomSize[1] = scanner.nextInt(); // wczytanie ilosci miejsc w rzedzie
        System.out.println();
        return roomSize;
    }

    private static void setSeats(Seat[][] room) {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = new Seat();
                room[i][j].zajete = "S";
            }
        }
    }

    private static void showRoom(Seat[][] room) {
        System.out.println("Cinema:");
        // linie z opisem siedzien
        System.out.print("  ");
        for (int i = 1; i <= room[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < room.length; i++) {
            System.out.print(i + 1 + " ");  //wstawienie numeru rzedu
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j].zajete + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}