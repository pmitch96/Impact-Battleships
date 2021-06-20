package BattleshipsPackage;

public class Ships {
//////////Attributes
protected int size;
protected String name;

//////////Constructors
public Ships(int size, String name) {
        this.size = size;
        this.name ="HMS_" + name;

}

//////////Methods
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
