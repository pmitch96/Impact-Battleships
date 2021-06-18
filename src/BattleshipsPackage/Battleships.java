package BattleshipsPackage;
import java.util.Arrays;
import java.util.Scanner;

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

String[][] Board = new String[10][10];

Arrays.fill(Board, Water);


}
}
