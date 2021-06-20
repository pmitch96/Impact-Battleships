package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {

    public static GameBoard P1Board = new GameBoard();

    public static GameBoard P1GamePlayBoard = new GameBoard();

    public static GameBoard P2Board = new GameBoard();

    public static GameBoard P2GamePlayBoard = new GameBoard();


    public static Scanner input = new Scanner(System.in);


    public static String P1Name = "Patrick";
    public static String P2Name = "Clive";

    public static void placeShipP1(){

        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Carrier", "5");
        ShipsToPlace[1] = new Ships(4, "Battleship", "4");
        ShipsToPlace[2] = new Ships(3, "Destroyer", "3");
        ShipsToPlace[3] = new Ships(3, "Submarine", "2");
        ShipsToPlace[4] = new Ships(2, "Patrol Boat", "1");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Admiral " + P1Name + ", please place " + ShipsToPlace[j].getName() + " using 5 consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                int x_co_ordinate;
                int y_co_ordinate;
                do {System.out.println("Please input an x co-ordinate");
                x_co_ordinate = input.nextInt();}
                while (x_co_ordinate < 0 || x_co_ordinate > P1Board.getBoard().length);
                do {System.out.println("Please input a y co-ordinate");
                y_co_ordinate = input.nextInt();}
                while (y_co_ordinate < 0 || y_co_ordinate > P1Board.getBoard().length);
                P1Board.getBoard()[x_co_ordinate][y_co_ordinate] = ShipsToPlace[j].getType();

            }
            P1Board.printBoard();
        }
        for (int k = 0; k <=50; k++) {
            System.out.println(" ");
        }
    }
    public static void placeShipP2(){
        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Carrier", "5");
        ShipsToPlace[1] = new Ships(4, "Battleship", "4");
        ShipsToPlace[2] = new Ships(3, "Destroyer", "3");
        ShipsToPlace[3] = new Ships(3, "Submarine", "2");
        ShipsToPlace[4] = new Ships(2, "Patrol Boat", "1");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Admiral "+ P2Name+ ", please place " + ShipsToPlace[j].getName() + " using 5 consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                int x_co_ordinate;
                int y_co_ordinate;
                do {System.out.println("Please input an x co-ordinate");
                 x_co_ordinate = input.nextInt();}
                while (x_co_ordinate < 0 || x_co_ordinate > P2Board.getBoard().length);
                do {System.out.println("Please input a y co-ordinate");
                y_co_ordinate = input.nextInt();}
                while (y_co_ordinate < 0 || y_co_ordinate > P2Board.getBoard().length);
                P2Board.getBoard()[x_co_ordinate][y_co_ordinate] = ShipsToPlace[j].getType();

            }
            P2Board.printBoard();

            }
        for (int k = 0; k <=50; k++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

    String water = "~";
    String hit = "X";
    String miss = "O";
    String ship = "*";

        GameBoard P1Board = new GameBoard();
        P1Board.fillBoard();
        P1Board.printBoard();



    for (String[] row : P1GamePlayBoard.getBoard()) {
            Arrays.fill(row, water);
        }

    for (String[] row : P2Board.getBoard()) {
            Arrays.fill(row, water);
        }

    for (String[] row : P2GamePlayBoard.getBoard()) {
            Arrays.fill(row, water);
        }

    placeShipP1();

    placeShipP2();

        int P1NumberHits = 0;
        int P2NumberHits = 0;

        while (P1NumberHits < 17 && P2NumberHits < 17) {

            int x_guessP1;
            int y_guessP1;

            System.out.println("Admiral " + P1Name + ", please input the x co-ordinate of your guess");
            x_guessP1 = input.nextInt();
            System.out.println("Admiral " + P1Name + ", please input the y co-ordinate of your guess");
            y_guessP1 = input.nextInt();
            String OutPutP1 = P2Board.getBoard()[x_guessP1][y_guessP1];


            if (OutPutP1 == "5" || OutPutP1 == "4" || OutPutP1 == "3"|| OutPutP1 == "2"|| OutPutP1 == "1") {
                System.out.println("Hit!");
                P2Board.getBoard()[x_guessP1][y_guessP1] = hit;
                P2GamePlayBoard.getBoard()[x_guessP1][y_guessP1] = hit;
                P1NumberHits = P1NumberHits + 1;
                P2GamePlayBoard.printBoard();
            }
            else if (OutPutP1 == miss){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else if (OutPutP1 == hit){
                System.out.println("Please enter co-ordinates that haven't been used before");
            }
            else {
                System.out.println("Miss");
                P2Board.getBoard()[x_guessP1][y_guessP1] = miss;
                P2GamePlayBoard.getBoard()[x_guessP1][y_guessP1] = miss;
                P2GamePlayBoard.printBoard();
            }


            System.out.println("Admiral " + P2Name + ", please input the x co-ordinate of your guess");
            int x_guessP2 = input.nextInt();
            System.out.println("Admiral " + P2Name + ", please input the y co-ordinate of your guess");
            int y_guessP2 = input.nextInt();
            String OutPutP2 = P1Board.getBoard()[x_guessP2][y_guessP2];

            if (OutPutP2 == "5" || OutPutP2 == "4" || OutPutP2 == "3"|| OutPutP2 == "2"|| OutPutP2 == "1") {
                    System.out.println("Hit!");
                    P1Board.getBoard()[x_guessP2][y_guessP2] = hit;
                    P1GamePlayBoard.getBoard()[x_guessP2][y_guessP2] = hit;
                    P2NumberHits = P2NumberHits + 1;
                    P1GamePlayBoard.printBoard();
            } else if (OutPutP2 == miss) {
                    System.out.println("Please enter co-ordinates that haven't been used before");
            } else if (OutPutP2 == hit) {
                    System.out.println("Please enter co-ordinates that haven't been used before");
            } else {
                    System.out.println("Miss");
                    P1Board.getBoard()[x_guessP2][y_guessP2] = miss;
                    P1GamePlayBoard.getBoard()[x_guessP2][y_guessP2] = miss;
                    P1GamePlayBoard.printBoard();
                }
            if (P1NumberHits == 17 || P2NumberHits == 17) {
                System.out.println("Game Over!");
            }
        }
    }
}


