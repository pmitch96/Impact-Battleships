package BattleshipsPackage;
import java.util.Scanner;
import java.util.ArrayList;



public class Battleships {

    public static void main(String[] args) {
Ships Gareth = new Ships(5, "HMS Gareth");
Ships Simon = new Ships(4, "HMS Simon");
Ships Jordan = new Ships(4, "HMS Jordan");
Ships Mo = new Ships(3, "HMS Mo");
Ships Ash = new Ships(3, "HMS Ash");
Ships Ethan = new Ships(3, "HMS Ethan");
Ships Leon = new Ships(3, "HMS Leon");
Ships Patrick = new Ships(2, "HMS Patrick");

int NumberOfRows = 10;
int NumberOfColumns = 10;
int NumberOfShips = 8;

String Ships = "Ship";
String Water = "Water";
String Hit = "Hit";
String Miss = "Miss";


ArrayList<ArrayList<GameBoardRow>> Board = new ArrayList<ArrayList<GameBoardRow> >(10);



ArrayList<String> Row = new ArrayList<String>(10);
for (int i =0; i <=9; i++){
Board.set(i, Water);
}
}
}