package hw4vencypatel;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        this.year  = cal.get(java.util.Calendar.YEAR);
        this.month = cal.get(java.util.Calendar.MONTH) + 1;
        this.day   = cal.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
