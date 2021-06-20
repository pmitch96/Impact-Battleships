package BattleshipsPackage;

public class GameBoard {

    public void printBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(gameBoard[j][i] + " ");
            }
            System.out.println();
        }
    }




    //////////Attributes
public static String[][] gameBoard = new String[10][10];


//////////Constructors
public GameBoard() {
}

//////////Methods

    public static String[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(String[][] gameBoard) {
        GameBoard.gameBoard = gameBoard;
    }

}
