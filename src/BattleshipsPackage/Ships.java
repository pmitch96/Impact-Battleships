package BattleshipsPackage;

public class Ships {
//////////Attributes
protected int size;
protected int hits;
protected String name;

//////////Constructors
public Ships(int size, String name, int hits) {
        this.size = size;
        this.name ="HMS_" + name;
        this.hits = hits;

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

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }


}
