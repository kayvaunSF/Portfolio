package corona;

public class Volunteer extends Employee {
    private double numberOfHours;
    private double ratePerHour;

    public Volunteer(int SSN, String firstName, String lastName, String address, String datOfBirth,double numberOfHours,double ratePerHour) {
        super(SSN, firstName, lastName, address, datOfBirth);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return this.numberOfHours*this.ratePerHour;
    }

    public String toString(){
        return super.toString()+"\nNumber of hours: "+this.numberOfHours+ "\nRate per hour: "+this.ratePerHour+"\nSalary: "+this.calculateSalary()+"\n";
    }
}
