package hw4vencypatel;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
        System.out.println("Faculty constructor");
    }

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary,
                   String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank        = rank;
        System.out.println("Faculty constructor");
    }

    public String toString() {
        return super.toString()
             + "\nClass : Faculty"
             + "\nOffice Hours : " + officeHours
             + "\nRank         : " + rank;
    }
}