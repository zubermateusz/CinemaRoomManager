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

        //showRoom(room);  //wyswietlenie pustej sali
        boolean run = true;
        while (run) {
            // wyswietlenie menu
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");


            Scanner scanner = new Scanner(System.in);
            System.out.print("> "); // znacznik dla usera
            int menuPosition = scanner.nextInt();

            switch (menuPosition) {
                case 1 -> {
                    showRoom(room);
                    break;
                }
                case 2 -> {
                    boolean goodSeatsChoice = false;
                    if (!goodSeatsChoice) {
                        int[] seat = askUserAboutSeat(room); // zapytanie ktore miejsce kupic
                        bookASeat(seat, room);
                    }
                    break;
                }

                case 3 -> {
                    System.out.println("Number of purchased tickets: 0");
                    System.out.println("Percentage: 0.00%");
                    System.out.println("Current income: $0");
                    System.out.println("Total income: $360");
                    break;
                }
                case 0 -> {
                    run = false;
                    break;
                }
            }
        }
    }

    private static boolean bookASeat(int[] seat, Seat[][] room) {
        boolean flag = false;
        if (room[seat[0] - 1][seat[1] - 1].zajete == "B") {
            System.out.println("That ticket has already been purchased!");
            flag = false;
        } else {
            showPrice(seat, room); //wyswietlenie ceny miejsca
            System.out.println(); //czysta linia
            room[seat[0] - 1][seat[1] - 1].zajete = "B"; //przypisanie miejsca jako zajete
            flag = true;
        }
        return flag;
    }

    private static void showPrice(int[] seat, Seat[][] room) {
        System.out.println("Ticket price: $" + room[seat[0] - 1][seat[1] - 1].cena);
    }

    private static void setPrice(Seat[][] room) {
        int row = room.length;
        int seatsInRow = room[0].length;

        if (row * seatsInRow <= 60) {
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

    private static int[] askUserAboutSeat(Seat[][] room) {
        Scanner scanner = new Scanner(System.in);
        boolean goodSeat = true;
        int[] seat = new int[2];
        while (goodSeat) {
            System.out.println("Enter a row number:");
            System.out.print("> "); // znacznik dla usera
            seat[0] = scanner.nextInt(); //wczytanie rzad miejsca
            System.out.println("Enter a seat number in that row:");
            System.out.print("> "); // znacznik dla usera
            seat[1] = scanner.nextInt(); // wczytanie numeru miejsca
            System.out.println();
            if (seat[0] > room.length || seat[1] > room[0].length) {
                System.out.println("Wrong input!");
                goodSeat = false;
            } else {
                goodSeat = true;
            }
        }
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
        setPrice(room); // ustawienie cen siedzen
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