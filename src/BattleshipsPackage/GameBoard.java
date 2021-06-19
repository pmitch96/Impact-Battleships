package BattleshipsPackage;

import java.util.Scanner;

public class GameBoard {
public static Scanner input = new Scanner(System.in);

    public void printBoard() {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(Board[j][i] + " ");
            }
            System.out.println();
        }
    }

//////////Attributes
public static String[][] Board = new String[10][10];





//////////Constructors




//////////Methods

}
