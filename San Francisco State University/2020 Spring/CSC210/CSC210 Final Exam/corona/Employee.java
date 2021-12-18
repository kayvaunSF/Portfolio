package corona;

public abstract class Employee {
    private int SSN;
    private String firstName;
    private String lastName;
    private String address;
    private String datOfBirth;

    public Employee(int SSN, String firstName, String lastName, String address, String datOfBirth) {
        this.SSN = SSN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.datOfBirth = datOfBirth;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String toString(){
        return "SSN: "+this.SSN+"\nFirst name: "+this.firstName+"\nLast name: "+ this.lastName+"\nAddress: "+this.address+"\nDOB: "+this.datOfBirth;
    }

    abstract double calculateSalary();
}
