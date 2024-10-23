package main.java.com.securelogin;

public class User {
    private String name;
    private String email;
    private String passwordHash;
    private String studentNumber;

    public User(String name, String email, String passwordHash) {
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.studentNumber = generateStudentNumber();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    private String generateStudentNumber() {
        // Generate a simple student number
        return "S" + (10000 + (int)(Math.random() * 90000));
    }
}