package BattleshipsPackage;

public abstract class Ships {
//////////Attributes
protected int size;

//////////Constructors
public Ships(int size) {
        this.size = size;

}

//////////Methods
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
