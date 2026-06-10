package hw4vencypatel;

public class Staff extends Employee {
    private String title;

    public Staff() {
        System.out.println("Staff constructor");
    }

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
        System.out.println("Staff constructor");
    }

    public String toString() {
        return super.toString()
             + "\nClass : Staff"
             + "\nTitle : " + title;
    }
}