package corona;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<FoodItem> foodSupply = new ArrayList<FoodItem>();
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static ArrayList<Donee> donees = new ArrayList<Donee>();
    private static ArrayList<Donor> donors = new ArrayList<Donor>();
    public static void print_menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("[1] To add a full time employee information");
            System.out.println("[2] To add a volunteer information");
            System.out.println("[3] To add Donor information");
            System.out.println("[4] To add Donee information");
            System.out.println("[5] To receive donation from a specific Donor");
            System.out.println("[6] To send donation to a specific Donee");
            System.out.println("[7] To print employees information & salaries for this cycle");
            System.out.println("[8] To print food pantry current supply");
            System.out.println("[9] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter SSN: ");
                    int SSN = Integer.valueOf(sc.nextLine());
                    System.out.println("Enter first name: ");
                    String firstName = sc.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = sc.nextLine();
                    System.out.println("Enter address: ");
                    String address = sc.nextLine();
                    System.out.println("Enter date of birth in dd-mm-yyyy format: ");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Enter starting date in dd-mm-yyyy format: ");
                    String startingDate = sc.nextLine();
                    System.out.println("Enter basic salary: ");
                    int basicSalary = Integer.valueOf(sc.nextLine());
                    Employee fe = new FullTimeEmployee(SSN,firstName,lastName,address,dateOfBirth,startingDate,basicSalary);
                    employees.add(fe);

                    //code goes here
                    break;
                case 2:
                    System.out.println("Enter SSN: ");
                    SSN = Integer.valueOf(sc.nextLine());
                    System.out.println("Enter first name: ");
                    firstName = sc.nextLine();
                    System.out.println("Enter last name: ");
                    lastName = sc.nextLine();
                    System.out.println("Enter address: ");
                    address = sc.nextLine();
                    System.out.println("Enter date of birth in dd-mm-yyyy format: ");
                    dateOfBirth = sc.nextLine();
                    System.out.println("Enter number of hours: ");
                    double numberOfHours = Double.valueOf(sc.nextLine());
                    System.out.println("Rate per hour: ");
                    double ratePerHour = Double.valueOf(sc.nextLine());
                    Employee volunteer =  new Volunteer(SSN,firstName,lastName,address,dateOfBirth,numberOfHours,ratePerHour);
                    employees.add(volunteer);

                    //code goes here
                    break;
                case 3:
                    System.out.println("Enter number of food items");
                    int numberOfFoodItems = Integer.valueOf(sc.nextLine());
                    FoodItem[] foodItems = new FoodItem[numberOfFoodItems];
                    for(int i=0; i<numberOfFoodItems; i++ ){
                        System.out.println("Enter g for grain\nd for dairy\np for prodce");
                        String foodkind = sc.nextLine();
                        while(!(foodkind.equalsIgnoreCase("g")|| foodkind.equalsIgnoreCase("d")|| foodkind.equalsIgnoreCase("p"))){
                            System.out.println("Enter g for grain\nd for dairy\np for prodce");
                            foodkind = sc.nextLine();
                        }
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter expiration date in dd-mm-yyyy format: ");
                        String expirationDate = sc.nextLine();
                        System.out.println("Enter quantity: ");
                        int quantity = Integer.valueOf(sc.nextLine());
                        System.out.println("Enter is organic or not: ");
                        boolean isOrganic = Boolean.valueOf(sc.nextLine());
                        if (foodkind.equalsIgnoreCase("g")){
                            System.out.println("Enter is processed or not: ");
                            boolean isProcessed = Boolean.valueOf(sc.nextLine());
                            Grains grains = new Grains(name,expirationDate,quantity,isOrganic,isProcessed);
                            foodItems[i] = grains;
                        }
                        else if (foodkind.equalsIgnoreCase("d")){
                            System.out.println("Enter if isNoneFat or not");
                            boolean isNoneFat = Boolean.valueOf(sc.nextLine());
                            System.out.println("Enter if vegan or not");
                            boolean isVegan = Boolean.valueOf(sc.nextLine());
                            Dairy dairy = new Dairy(name,expirationDate,quantity,isOrganic,isNoneFat,isVegan);
                            foodItems[i] = dairy;
                        }
                        else if(foodkind.equalsIgnoreCase("p")){
                            System.out.println("Enter isfruit: ");
                            boolean isFruit = Boolean.valueOf(sc.nextLine());
                            Produce produce = new Produce(name,expirationDate,quantity,isOrganic,isFruit);
                            foodItems[i] = produce;
                        }
                    }
                    System.out.println("Enter SSN");
                    SSN = Integer.valueOf(sc.nextLine());
                    Donor donor = new Donor(foodItems,SSN);
                    donors.add(donor);


                    //code goes here
                    break;
                case 4:
                    System.out.println("Enter number of food items");
                    numberOfFoodItems = Integer.valueOf(sc.nextLine());
                    foodItems = new FoodItem[numberOfFoodItems];
                    for(int i=0; i<numberOfFoodItems; i++ ){
                        System.out.println("Enter g for grain\nd for dairy\np for prodce");
                        String foodkind = sc.nextLine();
                        while(!(foodkind.equalsIgnoreCase("g")|| foodkind.equalsIgnoreCase("d")|| foodkind.equalsIgnoreCase("p"))){
                            System.out.println("Enter g for grain\nd for dairy\np for prodce");
                            foodkind = sc.nextLine();
                        }
                        System.out.println("Enter name:");
                        String name = sc.nextLine();
                        System.out.println("Enter expiration date in dd-mm-yyyy format: ");
                        String expirationDate = sc.nextLine();
                        System.out.println("Enter quantity: ");
                        int quantity = Integer.valueOf(sc.nextLine());
                        System.out.println("Is organic or not: ");
                        boolean isOrganic = Boolean.valueOf(sc.nextLine());
                        if (foodkind.equalsIgnoreCase("g")){
                            System.out.println("Enter is processed or not: ");
                            boolean isProcessed = Boolean.valueOf(sc.nextLine());
                            Grains grains = new Grains(name,expirationDate,quantity,isOrganic,isProcessed);
                            foodItems[i] = grains;
                        }
                        else if (foodkind.equalsIgnoreCase("d")){
                            System.out.println("Enter if isNoneFat or not");
                            boolean isNoneFat = Boolean.valueOf(sc.nextLine());
                            System.out.println("Enter if vegan or not");
                            boolean isVegan = Boolean.valueOf(sc.nextLine());
                            Dairy dairy = new Dairy(name,expirationDate,quantity,isOrganic,isNoneFat,isVegan);
                            foodItems[i] = dairy;
                        }
                        else if(foodkind.equalsIgnoreCase("p")){
                            System.out.println("Enter isfruit: ");
                            boolean isFruit = Boolean.valueOf(sc.nextLine());
                            Produce produce = new Produce(name,expirationDate,quantity,isOrganic,isFruit);
                            foodItems[i] = produce;
                        }
                    }
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter address");
                    address = sc.nextLine();
                    System.out.println("Enter SSN: ");
                    SSN = Integer.valueOf(sc.nextLine());
                    Donee donee = new Donee(foodItems,name,address,SSN);
                    donees.add(donee);
                    //code goes here
                    break;
                case 5:
                    System.out.println("Enter donor SSN");
                    SSN = Integer.valueOf(sc.nextLine());
                    boolean found = false;
                    for(Donor d: donors){
                        if (d.getSSN()==SSN){
                            found = true;
                            d.donate();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("No donor with that SSN number");
                    }
                    //code goes here
                    break;
                case 6:
                    found = false;
                    System.out.println("Enter donee SSN");
                    SSN = Integer.valueOf(sc.nextLine());
                    for (Donee d: donees){
                        if (d.getSSN() == SSN){
                            found = true;
                            d.receiveDonation();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("No donee with that SSN number");
                    }
                    //code goes here
                    break;
                case 7:
                    for(Employee employee:employees){
                        System.out.println(employee);
                    }
                    //code goes here
                    break;
                case 8:
                    for(FoodItem food: foodSupply){
                        System.out.println(food);
                    }
                    if (foodSupply.size() == 0){
                        System.out.println("No items in pantry");
                    }
                    //code goes here
                    break;
                case 9:
                    System.out.println("Thanks for using our system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-8]");
                    break;
            }
        } while (choice != 9);
    }

    public static void main(String[] args) {
        print_menu();

    }
}
