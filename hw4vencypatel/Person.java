package hw4vencypatel;

public class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(String name, String address, String phone, String email) {
        this.name    = name;
        this.address = address;
        this.phone   = phone;
        this.email   = email;
        System.out.println("Person constructor");
    }

    public String toString() {
        return "Class : Person"
             + "\nName    : " + name
             + "\nAddress : " + address
             + "\nPhone   : " + phone
             + "\nEmail   : " + email;
    }
}