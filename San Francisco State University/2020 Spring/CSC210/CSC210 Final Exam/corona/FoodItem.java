package corona;

public class FoodItem {
    private String name;
    private String expirationDate;
    private int quantity;
    private boolean isOrganic;

    public FoodItem(String name, String expirationDate, int quantity, boolean isOrganic) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
        this.isOrganic = isOrganic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public String toString(){
        return "Name: "+this.name+"\nExpiration date: "+this.expirationDate+"\nQuantity:"+this.quantity+"\nOrganic: "+this.isOrganic;
    }
}
