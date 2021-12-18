package corona;

public class Grains extends FoodItem {
    private boolean isProcessed;

    public Grains(String name, String expirationDate, int quantity, boolean isOrganic, boolean isProcessed) {
        super(name, expirationDate, quantity, isOrganic);
        this.isProcessed = isProcessed;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }

    public String toString(){
        return super.toString()+"\nProcessed: "+this.isProcessed+"\n";
    }
}
