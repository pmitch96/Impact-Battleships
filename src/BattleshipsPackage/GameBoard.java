package BattleshipsPackage;
import java.util.Scanner;
import java.util.Arrays;

public class GameBoard {
//////////Attributes
private final String[][] gameBoard = new String[10][10];


//////////Constructors
public GameBoard() {
}

//////////Methods

public String[][] getBoard() {
        return gameBoard;
    }

    public void printBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(gameBoard[j][i] + " ");
            }
            System.out.println();
        }
    }
     public void fillBoard(){
    for(String[] row : gameBoard) {
        Arrays.fill(row, "~");
    }
}

    public void placeShips(){

        Scanner input = new Scanner(System.in);

        Ships[] ShipsToPlace = new Ships[5];
        ShipsToPlace[0] = new Ships(5, "Carrier", "5");
        ShipsToPlace[1] = new Ships(4, "Battleship", "4");
        ShipsToPlace[2] = new Ships(3, "Destroyer", "3");
        ShipsToPlace[3] = new Ships(3, "Submarine", "2");
        ShipsToPlace[4] = new Ships(2, "Patrol Boat", "1");

        for (int j = 0; j <= 4; j++) {

            System.out.println("Please place " + ShipsToPlace[j].getName() + " using " + (5-j) + " consecutive co-ordinates, which aren't currently occupied by a ship");
            for (int i = 0; i <= (ShipsToPlace[j].getSize() - 1); i++) {
                int x_co_ordinate;
                int y_co_ordinate;
                do {System.out.println("Please input an x co-ordinate");
                    x_co_ordinate = input.nextInt();}
                while (x_co_ordinate < 0 || x_co_ordinate > gameBoard.length);
                do {System.out.println("Please input a y co-ordinate");
                    y_co_ordinate = input.nextInt();}
                while (y_co_ordinate < 0 || y_co_ordinate > gameBoard.length);
                gameBoard[x_co_ordinate][y_co_ordinate] = ShipsToPlace[j].getType();
            }
            for (int k = 0; k <= 9; k++) {
                for (int i = 0; i <= 9; i++) {
                    System.out.print(gameBoard[k][i] + " ");
                }
                System.out.println();
            }
        }
        for (int L = 0; L <=50; L++) {
            System.out.println(" ");
        }
    }
}

