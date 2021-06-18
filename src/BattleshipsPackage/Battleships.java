package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

public class Battleships {
 public static Scanner input = new Scanner(System.in);

 public static void main(String[] args) {
  Ships HMS_Gareth = new Ships(4);
  Ships HMS_Jordan = new Ships(3);

  int water = 0;
  int ships = 1;
  int hit = 2;
  int miss = 3;

  int[][] Board = new int[4][4];

  Arrays.fill(Board, water);

//Placing HMS_Gareth

  for (int i = 0; i <= 3; i++) {
   Board[0][i] = 1;
  }

//Placing HMS_Jordan

  for (int i = 0; i <= 2; i++) {
   Board[3][0] = 1;
  }

  int NumberOfHits = 0;

  System.out.println("Please input the x co-ordinate of your guess");
  int x_guess = input.nextInt();
  System.out.println("Please input the y co-ordinate of your guess");
  int y_guess = input.nextInt();

  int OutPut = Board[x_guess][y_guess];

  if (OutPut == 1) {
   System.out.println("Hit!");
   Board[x_guess][y_guess] = 2;
   int CurrentNumberOfHits = NumberOfHits +1;
  } else {
   System.out.println("Miss");
   Board[x_guess][y_guess] = 3;

   if (NumberOfHits == 7) {
    System.out.println("Game over!");
   }
  }
 }
}


