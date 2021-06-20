package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {

    public static String[][] P1Board = new String[10][10];

    public static String[][] P1GamePlayBoard = new String[10][10];

    public static String[][] P2Board = new String[10][10];

    public static String[][] P2GamePlayBoard = new String[10][10];

    public static Scanner input = new Scanner(System.in);

    public static void printBoardP1() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(P1Board[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void printBoardP2() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(P2Board[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void printGamePlayBoardP1() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(P1GamePlayBoard[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void printGamePlayBoardP2() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(P2GamePlayBoard[j][i] + " ");
            }
            System.out.println();
        }
    }
public static String P1Name = "Patrick";
public static String P2Name = "Clive";

    public static void placeShipP1(){

        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Carrier");
        ShipsToPlace[1] = new Ships(4, "Battleship");
        ShipsToPlace[2] = new Ships(3, "Destroyer");
        ShipsToPlace[3] = new Ships(3, "Submarine");
        ShipsToPlace[4] = new Ships(2, "Patrol Boat");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Admiral " + P1Name + ", please place " + ShipsToPlace[j].getName() + " using 5 consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                int x_co_ordinate;
                int y_co_ordinate;
                do {System.out.println("Please input an x co-ordinate");
                x_co_ordinate = input.nextInt();}
                while (x_co_ordinate < 0 || x_co_ordinate > P1Board.length);
                do {System.out.println("Please input a y co-ordinate");
                y_co_ordinate = input.nextInt();}
                while (y_co_ordinate < 0 || y_co_ordinate > P1Board.length);
                P1Board[x_co_ordinate][y_co_ordinate] = "*";

            }
            printBoardP1();
        }
        for (int k = 0; k <=29; k++) {
            System.out.println(" ");
        }
    }
    public static void placeShipP2(){
        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Carrier");
        ShipsToPlace[1] = new Ships(4, "Battleship");
        ShipsToPlace[2] = new Ships(3, "Destroyer");
        ShipsToPlace[3] = new Ships(3, "Submarine");
        ShipsToPlace[4] = new Ships(2, "Patrol Boat");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Admiral "+ P2Name+ ", please place " + ShipsToPlace[j].getName() + " using 5 consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                int x_co_ordinate;
                int y_co_ordinate;
                do {System.out.println("Please input an x co-ordinate");
                 x_co_ordinate = input.nextInt();}
                while (x_co_ordinate < 0 || x_co_ordinate > P1Board.length);
                do {System.out.println("Please input a y co-ordinate");
                y_co_ordinate = input.nextInt();}
                while (y_co_ordinate < 0 || y_co_ordinate > P1Board.length);
                P2Board[x_co_ordinate][y_co_ordinate] = "*";

            }
            printBoardP2();
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


    for (String[] row : P1Board) {
        Arrays.fill(row, water);
    }

    for (String[] row : P1GamePlayBoard) {
            Arrays.fill(row, water);
        }

    for (String[] row : P2Board) {
            Arrays.fill(row, water);
        }

    for (String[] row : P2GamePlayBoard) {
            Arrays.fill(row, water);
        }

    placeShipP1();

    placeShipP2();

        int P1NumberHits = 0;
        int P2NumberHits = 0;

        while (P1NumberHits < 17 && P2NumberHits < 17) {

            System.out.println("Admiral " + P1Name + ", please input the x co-ordinate of your guess");
            int x_guessP1 = input.nextInt();
            System.out.println("Admiral " + P1Name + ", please input the y co-ordinate of your guess");
            int y_guessP1 = input.nextInt();
            String OutPutP1 = P2Board[x_guessP1][y_guessP1];

            if (OutPutP1 == ship) {
                System.out.println("Hit!");
                P2Board[x_guessP1][y_guessP1] = hit;
                P2GamePlayBoard[x_guessP1][y_guessP1] = hit;
                P1NumberHits = P1NumberHits + 1;
                printGamePlayBoardP2();
            }
            else if (OutPutP1 == miss){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else if (OutPutP1 == hit){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else {
                System.out.println("Miss");
                P2Board[x_guessP1][y_guessP1] = miss;
                P2GamePlayBoard[x_guessP1][y_guessP1] = miss;
                printGamePlayBoardP2();
            }

            System.out.println("Admiral " + P2Name + ", please input the x co-ordinate of your guess");
            int x_guessP2 = input.nextInt();
            //while (x_guessP2 < 0 || x_guessP2 > P2Board.length);
            System.out.println("Admiral " + P2Name + ", please input the y co-ordinate of your guess");
            int y_guessP2 = input.nextInt();
            String OutPutP2 = P2Board[x_guessP2][y_guessP2];

            if (OutPutP2 == ship) {
                System.out.println("Hit!");
                P1Board[x_guessP2][y_guessP2] = hit;
                P1GamePlayBoard[x_guessP2][y_guessP2] = hit;
                P2NumberHits = P2NumberHits + 1;
                printGamePlayBoardP1();
            }
            else if (OutPutP2 == miss){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else if (OutPutP2 == hit){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else {
                System.out.println("Miss");
                P1Board[x_guessP2][y_guessP2] = miss;
                P1GamePlayBoard[x_guessP2][y_guessP2] = miss;
                printGamePlayBoardP1();
            }

            if (P1NumberHits == 17 || P2NumberHits == 17) {
                System.out.println("Game Over!");
            }

        }

    }
}


