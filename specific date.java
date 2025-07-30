import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("/");

        // Check format
        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }

        int day, month, year;
        try {
            day = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
            return;
        }

        // Year range check
        if (year < 1900 || year > 9999) {
            System.out.println("Invalid");
            return;
        }

        // Month check
        if (month < 1 || month > 12) {
            System.out.println("Invalid");
            return;
        }

        // Days in each month
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 
                              31, 31, 30, 31, 30, 31 };

        // Leap year check for February
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Day check
        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) ||
               (year % 400 == 0);
    }
}
