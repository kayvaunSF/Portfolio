package corona;

public class FullTimeEmployee extends Employee {
    private String startingDate;
    private double basicSalary;

    public FullTimeEmployee(int SSN, String firstName, String lastName, String address, String datOfBirth, String startingDate, double basicSalary) {
        super(SSN, firstName, lastName, address, datOfBirth);
        this.startingDate = startingDate;
        this.basicSalary = basicSalary;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    double calculateSalary() {
        String[] startdate = this.startingDate.split("-");
        int year = Integer.parseInt(startdate[2]);
        return this.basicSalary+ 1.05*(2020-year);
    }

    public String toString(){
        return super.toString()+"\nBasic salary: "+this.basicSalary+ "\nStarting date: "+ this.startingDate+"\nSalary:"+this.calculateSalary()+"\n";
    }
}
