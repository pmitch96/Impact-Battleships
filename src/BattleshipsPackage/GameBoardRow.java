package BattleshipsPackage;
import java.util.ArrayList;
public class GameBoardRow {




//////////Attributes
    private ArrayList<String> strings;
//////////Constructors
public GameBoardRow(ArrayList<String> strings) {
    this.strings = strings;
}
//////////Methods
public ArrayList<String> getStrings() {
    return strings;
}

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }
}
