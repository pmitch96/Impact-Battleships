package BattleshipsPackage;

public class Ships {
//////////Attributes
protected int size;
protected String name;

    protected String type;

//////////Constructors
public Ships(int size, String name, String type) {
        this.size = size;
        this.name ="HMS_" + name;
        this.type = type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
