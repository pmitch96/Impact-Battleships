package BattleshipsPackage;
import java.util.ArrayList;
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

    public static void main(String[] args) {

//  Ships HMS_Gareth = new Ships(4);
//  Ships HMS_Jordan = new Ships(3);

        String water = "~";
        String hit = "X";
        String miss = "O";
        String ship = "*";


        for (String[] row : Board) {
            Arrays.fill(row, water);
        }

       //ArrayList<Ships> ships; {
      //      ships = new ArrayList<Ships>();
       // }


//Placing HMS_Gareth

        System.out.println("Place HMS_Gareth, using 5 consecutive co-ordinates");

        for (int i = 0; i <=4; i++){
        System.out.println("Please input an x co-ordinate");
        int x_co_ordinate = input.nextInt();
        System.out.println("Please input a y co-ordinate");
        int y_co_ordinate = input.nextInt();
        Board[x_co_ordinate][y_co_ordinate] = ship;
        }
        printBoard();


       // for (int i = 0; i <= 3; i++) {
        //    Board[0][i] = ship;
        //}

//Placing HMS_Jordan

       // for (int i = 0; i <= 2; i++) {
        //    Board[3][i] = ship;
        //}

        System.out.println("Place HMS_Jordan, using 4 consecutive co-ordinates");

        for (int i = 0; i <=3; i++){
            System.out.println("Please input an x co-ordinate");
            int x_co_ordinate = input.nextInt();
            System.out.println("Please input a y co-ordinate");
            int y_co_ordinate = input.nextInt();
            Board[x_co_ordinate][y_co_ordinate] = ship;
        }

        printBoard();

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


