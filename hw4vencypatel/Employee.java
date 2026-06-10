package hw4vencypatel;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee() {
        System.out.println("Employee constructor");
    }

    public Employee(String name, String address, String phone, String email,
                    String office, double salary) {
        super(name, address, phone, email);
        this.office    = office;
        this.salary    = salary;
        this.dateHired = new MyDate();
        System.out.println("Employee constructor");
    }

    public String toString() {
        return super.toString()
             + "\nClass : Employee"
             + "\nEmployee Salary   : " + salary
             + "\nEmployee Office   : " + office
             + "\nEmployee HireDate : " + dateHired;
    }
}