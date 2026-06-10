package hw4vencypatel;

public class Student extends Person {
    public final int FRESHMAN  = 1;
    public final int SOPHOMORE = 2;
    public final int JUNIOR    = 3;
    public final int SENIOR    = 4;

    private int status;

    public Student() {
        System.out.println("Student constructor");
    }

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
        System.out.println("Student constructor");
    }

    public String toString() {
        return super.toString()
             + "\nClass : Student"
             + "\nStudent Status : " + status;
    }
}