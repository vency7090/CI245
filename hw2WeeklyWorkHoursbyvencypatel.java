package homework2vencypatel;


//program: Weekly Work Hours
//programmer name: vency patel


import java.util.Scanner;

public class hw2WeeklyWorkHoursbyvencypatel {

    public static void main(String[] args) {
    	System.out.println("HW2 Problem - Weekly Work Hours by Vency Patel");
        System.out.println();

        String[] NAMES = {"Tom ", "Jane", "Mark"};
        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

        double[][] hours = new double[NAMES.length][DAYS.length];

        input_hours(hours, NAMES, DAYS);
        display_hours(hours, NAMES, DAYS);
        System.out.println("--------------------------------------");
        System.out.println("Total hours : " + totalHours(hours, NAMES, DAYS));
        totalHoursByEmployee(hours, NAMES, DAYS);
    }

    // 1) Method to enter work hours
    public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("Enter the work hours for " + NAMES[i]);
            for (int j = 0; j < DAYS.length; j++) {
                System.out.print(DAYS[j] + " : ");
                hours[i][j] = scanner.nextDouble();
            }
        }
    }

    // 2) Method to display all work hours
    public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {
        System.out.println("Display Weekly Work Hours");
        System.out.print("         ");
        for (String day : DAYS) {
            System.out.printf("%-6s", day);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (int i = 0; i < NAMES.length; i++) {
            System.out.printf("%-6s|  ", NAMES[i]);
            for (int j = 0; j < DAYS.length; j++) {
                System.out.printf("%-6.1f", hours[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }

    // 3) Method to compute total hours
    public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
        double total = 0;
        for (int i = 0; i < NAMES.length; i++) {
            for (int j = 0; j < DAYS.length; j++) {
                total += hours[i][j];
            }
        }
        return total;
    }

    // 4) Method to show total hours by each employee
    public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {
        System.out.println();
        System.out.println("Total Hours By Employee");
        System.out.println("--------------------------------------");
        for (int i = 0; i < NAMES.length; i++) {
            double empTotal = 0;
            for (int j = 0; j < DAYS.length; j++) {
                empTotal += hours[i][j];
            }
            System.out.printf("%-6s|  %.1f%n", NAMES[i], empTotal);
        }
    }
}