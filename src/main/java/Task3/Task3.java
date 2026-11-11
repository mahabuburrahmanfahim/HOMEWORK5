package it.vcd;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int numSubjects = scanner.nextInt();
        int numStudents = scanner.nextInt();

        int[][] grades = new int[numStudents][numSubjects];
        double[] studentAverages = new double[numStudents];

        // Read input data into a 2D array
        for (int i = 0; i < numStudents; i++) {
            int studentSum = 0;
            for (int j = 0; j < numSubjects; j++) {
                grades[i][j] = scanner.nextInt();
                studentSum += grades[i][j];
            }
            // 1. Calculate each student's average grade
            studentAverages[i] = (double) studentSum / numSubjects;
        }

        // Output 1: Each student's average grade
        System.out.println("Student averages:");
        for (int i = 0; i < numStudents; i++) {
            // Printing formatted to handle whole numbers nicely like the example, or use %.2f if decimals are preferred
            if (studentAverages[i] == (int) studentAverages[i]) {
                System.out.println((int) studentAverages[i]);
            } else {
                System.out.println(studentAverages[i]);
            }
        }
        System.out.println();

        // 2. Calculate the group's average grade
        double totalSum = 0;
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                totalSum += grades[i][j];
            }
        }
        double groupAverage = totalSum / (numStudents * numSubjects);
        System.out.println("Group average:");
        System.out.println(groupAverage);
        System.out.println();

        // 3. Find the student(s) with the highest average grade
        double maxAverage = -1;
        for (int i = 0; i < numStudents; i++) {
            if (studentAverages[i] > maxAverage) {
                maxAverage = studentAverages[i];
            }
        }

        System.out.println("Highest-performing student(s):");
        for (int i = 0; i < numStudents; i++) {
            if (studentAverages[i] == maxAverage) {
                System.out.println("Student " + (i + 1));
            }
        }
        System.out.println();

        // 4. Find the numbers of all students who have at least one grade below 5
        System.out.println("Students with at least one grade below 5:");
        boolean foundBelowFive = false;
        for (int i = 0; i < numStudents; i++) {
            boolean hasLowGrade = false;
            for (int j = 0; j < numSubjects; j++) {
                if (grades[i][j] < 5) {
                    hasLowGrade = true;
                    break;
                }
            }
            if (hasLowGrade) {
                System.out.println("Student " + (i + 1));
                foundBelowFive = true;
            }
        }
        if (!foundBelowFive) {
            System.out.println("None");
        }
    }
}