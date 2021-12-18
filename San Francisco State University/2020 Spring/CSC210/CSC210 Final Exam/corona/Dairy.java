package corona;

public class Dairy extends FoodItem {
    private boolean isNoneFat;
    private boolean isVegan;

    public Dairy(String name, String expirationDate, int quantity, boolean isOrganic, boolean isNoneFat, boolean isVegan) {
        super(name, expirationDate, quantity, isOrganic);
        this.isNoneFat = isNoneFat;
        this.isVegan = isVegan;
    }

    public boolean isNoneFat() {
        return isNoneFat;
    }

    public void setNoneFat(boolean noneFat) {
        isNoneFat = noneFat;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String toString(){
        return super.toString()+"\nNoneFat: "+ this.isNoneFat+"\nVegan"+ this.isVegan+"\n";
    }
}
