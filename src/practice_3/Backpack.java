package practice_3;

public class Backpack {
    private Integer backpackNumber;
    private String pocketForBooks;
    private String pocketForApples;
    private String pocketForBottles;

    public Backpack (Integer backpackNumber, String pocketForBooks, String pocketForApples, String pocketForBottles){
        this.backpackNumber = backpackNumber;
        this.pocketForBooks = pocketForBooks;
        this.pocketForApples = pocketForApples;
        this.pocketForBottles = pocketForBottles;
    }

    public Integer getBackpackNumber() {
        return backpackNumber;
    }
    public String getPocketForBooks() {
        return pocketForBooks;
    }
    public String getPocketForApples() {
        return pocketForApples;
    }
    public String getPocketForBottles() {
        return pocketForBottles;
    }

    public void setBackpackNumber(Integer backpackNumber) {
        this.backpackNumber = backpackNumber;
    }

    public void setPocketForBooks(String pocketForBooks) {
        this.pocketForBooks = pocketForBooks;
    }

    public void setPocketForApples(String pocketForApples) {
        this.pocketForApples = pocketForApples;
    }

    public void setPocketForBottles(String pocketForBottles) {
        this.pocketForBottles = pocketForBottles;
    }

    @Override
    public String toString (){
    return "the backpack #" + backpackNumber + " contains " + pocketForBooks + ", " + pocketForApples + ", " + pocketForBottles;
    }

}
