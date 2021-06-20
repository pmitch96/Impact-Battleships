package BattleshipsPackage;

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

}
