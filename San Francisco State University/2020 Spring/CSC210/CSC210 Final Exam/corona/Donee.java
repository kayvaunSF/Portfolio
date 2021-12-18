package corona;

public class Donee {
    private FoodItem[] foodNeed;
    private String Name;
    private String address;
    private int SSN;

    public Donee(FoodItem[] foodNeed, String name, String address, int SSN) {
        this.foodNeed = foodNeed;
        Name = name;
        this.address = address;
        this.SSN = SSN;
    }

    public FoodItem[] getFoodNeed() {
        return foodNeed;
    }

    public void setFoodNeed(FoodItem[] foodNeed) {
        this.foodNeed = foodNeed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void receiveDonation() {
        int length = foodNeed.length;
        for (FoodItem doneeFood : foodNeed) {
            for (FoodItem supplyFood : Main.foodSupply) {
                if (doneeFood.getQuantity() > 0) {
                    if (doneeFood.getName().equals(supplyFood.getName())) {
                        if (supplyFood.getQuantity() > doneeFood.getQuantity()) {
                            int k = supplyFood.getQuantity() - doneeFood.getQuantity();
                            doneeFood.setQuantity(0);
                            supplyFood.setQuantity(k);
                        } else {
                            int l = doneeFood.getQuantity() - supplyFood.getQuantity();
                            doneeFood.setQuantity(l);
                            supplyFood.setQuantity(0);
                        }
                    }
                }
            }
            if (doneeFood.getQuantity()>0){
                System.out.println("Food supply doesn't consist quantity for "+ doneeFood.getName());
            }
            else{
                System.out.println(doneeFood.getName()+ " supply needs are met.");
            }
        }

    }
}
