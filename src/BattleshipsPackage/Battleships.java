package BattleshipsPackage;
import java.util.Scanner;

public class Battleships {

    public static GameBoard P1Board = new GameBoard();

    public static GameBoard P1GamePlayBoard = new GameBoard();

    public static GameBoard P2Board = new GameBoard();

    public static GameBoard P2GamePlayBoard = new GameBoard();

    public static Scanner input = new Scanner(System.in);

    public static String P1Name = "Patrick";
    public static String P2Name = "Clive";

    public static void main(String[] args) {

    String hit = "X";
    String miss = "O";

    P1Board.fillBoard();
    P1GamePlayBoard.fillBoard();
    P2Board.fillBoard();
    P2GamePlayBoard.fillBoard();
    P1Board.placeShips();
    P2Board.placeShips();

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


