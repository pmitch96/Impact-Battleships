package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {

public static Scanner input = new Scanner(System.in);


 public static void main(String[] args) {
//  Ships HMS_Gareth = new Ships(4);
//  Ships HMS_Jordan = new Ships(3);

  String water = "~";
  String hit = "X";
  String miss = "O";
  String ship = "S";

String[][] Board = new String[10][10];

for (String[] row : Board){
    Arrays.fill(row, water);
}


//Placing HMS_Gareth

  for (int i = 0; i <= 3; i++) {
   Board[0][i] = ship;
  }

//Placing HMS_Jordan

  for (int i = 0; i <= 2; i++) {
   Board[3][i] = ship;
  }

 System.out.println(Arrays.deepToString(Board));

  int NumberHits = 0;

  System.out.println("Please input the x co-ordinate of your guess");
  int x_guess = input.nextInt();
  System.out.println("Please input the y co-ordinate of your guess");
  int y_guess = input.nextInt();
  String OutPut = Board[x_guess][y_guess];

  if (OutPut == ship) {
   System.out.println("Hit!");
   Board[x_guess][y_guess] = hit;
   NumberHits = NumberHits + 1;

  } else {
   System.out.println("Miss");
   Board[x_guess][y_guess] = miss;
  }

  if (NumberHits == 1 ) {
      System.out.println("Game Over!");
  }

System.out.println(Arrays.deepToString(Board));

 }

}


