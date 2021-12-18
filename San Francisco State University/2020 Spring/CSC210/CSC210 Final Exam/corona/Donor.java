package corona;

public class Donor {
    private FoodItem[] donateFood;
    private int SSN;

    public Donor(FoodItem[] donateFood, int SSN) {
        this.donateFood = donateFood;
        this.SSN = SSN;
    }

    public FoodItem[] getDonateFood() {
        return donateFood;
    }

    public void setDonateFood(FoodItem[] donateFood) {
        this.donateFood = donateFood;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void donate(){
        int length = donateFood.length;
        for (FoodItem f:donateFood){
        Main.foodSupply.add(f);
        }
        this.donateFood = new FoodItem[length];
    }
}
