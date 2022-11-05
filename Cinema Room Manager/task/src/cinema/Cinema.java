package cinema;

public class Cinema {

    private static String[][] room = new String[7][8];

    public static void main(String[] args) {
        // Write your code here
        setSeats();
        showRoom();
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