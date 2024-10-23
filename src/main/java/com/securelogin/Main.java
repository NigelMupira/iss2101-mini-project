package main.java.com.securelogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Secure Login Application");

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Generate Password");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();

                    boolean registered = userService.registerUser(new User(name, email, password));
                    if (registered) {
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("User already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter your email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    User loggedInUser = userService.login(loginEmail, loginPassword);
                    if (loggedInUser != null) {
                        System.out.println("Welcome, " + loggedInUser.getName() + "! Your student number is " + loggedInUser.getStudentNumber());
                    } else {
                        System.out.println("Invalid email or password.");
                    }
                    break;

                case 3:
                    System.out.print("Enter desired password length: ");
                    int length = scanner.nextInt();
                    String generatedPassword = PasswordUtils.generateStrongPassword(length);
                    System.out.println("Generated Password: " + generatedPassword);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}