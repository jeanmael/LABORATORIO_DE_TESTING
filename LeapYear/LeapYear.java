package LeapYear;

import java.util.Scanner;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        LeapYear ly = new LeapYear();
        if (ly.isLeapYear(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
        scanner.close();
    }
}
