package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {

    public static String[][] Board = new String[10][10];

    public static String[][] GamePlayBoard = new String[10][10];

    public static Scanner input = new Scanner(System.in);

    public static void printBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(Board[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void printGamePlayBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(GamePlayBoard[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void placeShip(){
        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Gareth");
        ShipsToPlace[1] = new Ships(4, "Jordan");
        ShipsToPlace[2] = new Ships(3, "Ethan");
        ShipsToPlace[3] = new Ships(3, "Leon");
        ShipsToPlace[4] = new Ships(2, "Patrick");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Place " + ShipsToPlace[j].getName() + " using 5 consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                System.out.println("Please input an x co-ordinate");
                int x_co_ordinate = input.nextInt();
                System.out.println("Please input a y co-ordinate");
                int y_co_ordinate = input.nextInt();
                Board[x_co_ordinate][y_co_ordinate] = "*";
            }
            printBoard();
        }
        for (int k = 0; k <=29; k++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {


    String water = "~";
    String hit = "X";
    String miss = "O";
    String ship = "*";

    GameBoard testBoard = new GameBoard();



    System.out.println(testBoard);


    for (String[] row : Board) {
        Arrays.fill(row, water);
    }

        for (String[] row : GamePlayBoard) {
            Arrays.fill(row, water);
        }

    placeShip();

        int NumberHits = 0;

        while (NumberHits < 17) {

            System.out.println("Please input the x co-ordinate of your guess");
            int x_guess = input.nextInt();
            System.out.println("Please input the y co-ordinate of your guess");
            int y_guess = input.nextInt();
            String OutPut = Board[x_guess][y_guess];

            if (OutPut == ship) {
                System.out.println("Hit!");
                Board[x_guess][y_guess] = hit;
                GamePlayBoard[x_guess][y_guess] = hit;
                NumberHits = NumberHits + 1;
                printGamePlayBoard();
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
                GamePlayBoard[x_guess][y_guess] = miss;
                printGamePlayBoard();
            }

            if (NumberHits == 17) {
                System.out.println("Game Over!");
            }

        }

    }
}


