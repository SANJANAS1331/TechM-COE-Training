package org.example;

import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        Mark_TotalAndAverage();
    }

    private void Mark_TotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;
    }

    public void display() {
        System.out.printf("%-10s | Total: %3d | Average: %.2f%n", name, total, average);
    }
}

public class StudentResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();
            int[] marks = new int[subjects];

            System.out.print("Enter marks (space-separated): ");
            for (int j = 0; j < subjects; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students.add(new Student(name, marks));
        }

        students.sort((s1, s2) -> Integer.compare(s2.total, s1.total));

        System.out.println("\nSorted Student List (Based on Total Marks):");
        for (Student stud : students) {
            stud.display();
        }

        sc.close();
    }
}
