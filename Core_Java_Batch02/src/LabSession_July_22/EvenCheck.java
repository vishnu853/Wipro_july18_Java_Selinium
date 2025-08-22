package LabSession_July_22;

import java.util.Scanner;

public class EvenCheck {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Main method to test isEven
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Use control statement to display result
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
