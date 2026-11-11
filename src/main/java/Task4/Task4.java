package it.vcd;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Read the matrix input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Modify diagonals
        for (int i = 0; i < n; i++) {
            // Main diagonal condition: row index equals column index (i == j)
            matrix[i][i] = 0;

            // Secondary diagonal condition: column index equals (n - 1 - i)
            matrix[i][n - 1 - i] = 0;
        }

        // Print the resulting matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}