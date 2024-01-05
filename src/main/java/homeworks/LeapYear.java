package homeworks;

import java.util.Scanner;

//3. Display the number of days in month February from a year between 1900-2016 that is read from keyboard
//HINT
//
//A year is a leap year if:
//
//-Is divisible by 4 but not by 100
//-Is divisible by 100 but not by 400
//
//Name the class (and java file) LeapYear.
public class LeapYear {
    public static void main(String[] args) {
        //se scaneaza anul care se introduce
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between 1900 and 2016:");
        int year = scanner.nextInt();
        scanner.close();

        // se verifica daca anul este bisect
        private static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        }

        //se afiseaza daca anul este bisect
        if (isLeapYear(year)) {
            System.out.println("Anul" + year + "este bisect si luna februarie are 29 de zile.");
        } else {
            System.out.println("Anul" + year + "nu este bisect si luna februarie are 28 de zile.");
        }
    }
}
