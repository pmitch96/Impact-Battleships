package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {

    public static String[][] Board = new String[10][10];

    public static Scanner input = new Scanner(System.in);

    public static void printBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(Board[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void placeShip(){
        Ships[] shipObjects = new Ships[5];
        shipObjects[0] = new Ships(5, "Gareth");
        shipObjects[1] = new Ships(4, "Jordan");
        shipObjects[2] = new Ships(3, "Ethan");
        shipObjects[3] = new Ships(3, "Leon");
        shipObjects[4] = new Ships(2, "Patrick");

        for (int j = 0; j<= 4; j++) {

            System.out.println("Place " + shipObjects[0].getName() + " using 5 consecutive co-ordinates");
            for (int i = 0; i <= (shipObjects[0].getSize() - 1); i++) {
                System.out.println("Please input an x co-ordinate");
                int x_co_ordinate = input.nextInt();
                System.out.println("Please input a y co-ordinate");
                int y_co_ordinate = input.nextInt();
                Board[x_co_ordinate][y_co_ordinate] = "*";
            }
            printBoard();
        }
    }

    public static void main(String[] args) {


    String water = "~";
    String hit = "X";
    String miss = "O";
    String ship = "*";


    for (String[] row : Board) {
        Arrays.fill(row, water);
    }

    placeShip();

        int NumberHits = 0;

        while (NumberHits < 9) {

            System.out.println("Please input the x co-ordinate of your guess");
            int x_guess = input.nextInt();
            System.out.println("Please input the y co-ordinate of your guess");
            int y_guess = input.nextInt();
            String OutPut = Board[x_guess][y_guess];

            if (OutPut == ship) {
                System.out.println("Hit!");
                Board[x_guess][y_guess] = hit;
                NumberHits = NumberHits + 1;
                printBoard();
            }
            else if (OutPut == miss){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else if (OutPut == hit){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else {
                System.out.println("Miss");
                Board[x_guess][y_guess] = miss;
                printBoard();
            }

            if (NumberHits == 9) {
                System.out.println("Game Over!");
            }

        }

    }
}


