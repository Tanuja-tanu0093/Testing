package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        App app = new App();
        System.out.println("Sum: " + app.addNumbers(5, 10));

        scanner.close();
    }

    // Method to add two numbers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Example of a code smell (unused variable)
    public void sampleMethod() {
        int unusedVariable = 42; // SonarQube should flag this as an issue
    }

    // Example of a potential bug (division by zero)
    public int divide(int a, int b) {
        return a / b; // SonarQube will warn if 'b' is zero
    }
}
