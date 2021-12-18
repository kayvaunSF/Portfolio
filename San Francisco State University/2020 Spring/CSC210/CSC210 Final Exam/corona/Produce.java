package corona;

public class Produce extends FoodItem {
    private boolean isFruit;

    public Produce(String name, String expirationDate, int quantity, boolean isOrganic, boolean isFruit) {
        super(name, expirationDate, quantity, isOrganic);
        this.isFruit = isFruit;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit(boolean fruit) {
        isFruit = fruit;
    }

    public String toString(){
        return super.toString()+"\nFruit: "+this.isFruit+"\n";
    }
}
