import java.util.Scanner;

public class CodeQuestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to CodeQuest: Java Adventures!");
        System.out.println("Let's begin your first quest.");

        // Quest 1: Introduction to Variables
        System.out.println("\nQuest 1: Introduction to Variables");
        System.out.println("Write a Java program that calculates the area of a rectangle.");

        // Player input for rectangle dimensions
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and display result
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        // Quest 2: Loops and Conditionals
        System.out.println("\nQuest 2: Loops and Conditionals");
        System.out.println("Write a Java program to check if a number is prime.");

        // Player input for number
        System.out.print("Enter a number to check for primality: ");
        int num = scanner.nextInt();

        // Check for prime using a loop and conditional
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display prime or not prime message
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Quest completion message
        System.out.println("\nCongratulations! You completed the quests.");

        // Close scanner
        scanner.close();
    }
}
