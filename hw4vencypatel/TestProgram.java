package hw4vencypatel;

public class TestProgram {
    public static void main(String[] args) {

        System.out.println("\n--- Create and display a Person ---");
        Person p = new Person("John Smith", "123 Main Street", "773-111-2222", "john@gmail.com");
        System.out.println(p);

        System.out.println("\n--- Create and display a Student ---");
        Student s = new Student("Alice", "456 Oak Street", "312-222-3333", "alice@gmail.com", 1);
        System.out.println(s);

        System.out.println("\n--- Create and display an Employee ---");
        Employee e = new Employee("David", "789 Pine Street", "847-333-4444", "david@gmail.com", "W415", 54000);
        System.out.println(e);

        System.out.println("\n--- Create and display a Faculty ---");
        Faculty f = new Faculty("Professor Lee", "100 College Ave", "630-444-5555", "lee@college.edu", "B201", 85000, "9 AM - 12 PM", "Professor");
        System.out.println(f);

        System.out.println("\n--- Create and display a Staff ---");
        Staff st = new Staff("Mary", "200 Campus Rd", "224-555-6666", "mary@college.edu", "C101", 45000, "Administrator");
        System.out.println(st);
    }
}