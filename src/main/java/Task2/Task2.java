package it.vcd;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int[] residents = new int[n]; // Array to store residents for each house

        // Read input data into the array
        for (int i = 0; i < n; i++) {
            residents[i] = scanner.nextInt();
        }

        int totalResidents = 0;
        int leftSideResidents = 0;
        int leftSideHouseCount = 0;
        int rightSideResidents = 0;
        int rightSideHouseCount = 0;

        // Process data using the array
        for (int i = 0; i < n; i++) {
            int houseNumber = i + 1; // House numbers are 1-indexed (1 to n)
            int count = residents[i];

            totalResidents += count;

            if (houseNumber % 2 != 0) {
                // Odd house numbers are on the left side
                leftSideResidents += count;
                leftSideHouseCount++;
            } else {
                // Even house numbers are on the right side
                rightSideResidents += count;
                rightSideHouseCount++;
            }
        }

        // Calculate averages (avoiding division by zero)
        double leftAverage = leftSideHouseCount > 0 ? (double) leftSideResidents / leftSideHouseCount : 0.0;
        double rightAverage = rightSideHouseCount > 0 ? (double) rightSideResidents / rightSideHouseCount : 0.0;

        // Print results
        System.out.println("1. Total residents on the street: " + totalResidents);
        System.out.println("2. Residents on the left side: " + leftSideResidents + ", Right side: " + rightSideResidents);
        System.out.printf("3. Average residents per house -> Left side: %.2f, Right side: %.2f\n", leftAverage, rightAverage);
    }
}