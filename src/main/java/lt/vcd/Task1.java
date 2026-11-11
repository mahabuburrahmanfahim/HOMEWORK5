package it.vcd;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int maxRadius = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int radius = scanner.nextInt();

            if (radius > maxRadius) {
                maxRadius = radius;
                count = 1; // Reset count for the new maximum radius
            } else if (radius == maxRadius) {
                count++; // Increment count for matching maximum radius
            }
        }

        System.out.println(maxRadius + " - " + count);
    }
}