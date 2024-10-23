# Secure Login Application

## Overview
The Secure Login Application is a Java-based application that provides secure user registration and login functionality. It ensures that user data is handled securely and adheres to best practices in coding and security.

## Features
- User registration with secure password storage
- User login with authentication
- Displays user's name and student number upon successful login
- Password generator for strong passwords
- Implements OWASP top 10 security principles

## Technologies Used
- Java 22
- IntelliJ IDEA
- JUnit for unit testing
- BCrypt for password hashing

## Secure Coding Principles
- Input validation to prevent injection attacks
- Password hashing with a strong algorithm
- Use of prepared statements for database operations

## OWASP Top 10 Considerations
1. **Injection**: Use prepared statements to prevent SQL injection.
2. **Broken Authentication**: Implement secure session management and password policies.
3. **Sensitive Data Exposure**: Store passwords using hashing and salting.
4. **XML External Entities (XXE)**: Avoid XML parsing or use secure parsers.
5. **Broken Access Control**: Ensure proper role-based access control.
6. **Security Misconfiguration**: Secure configurations in deployment.
7. **Cross-Site Scripting (XSS)**: Sanitize user inputs.
8. **Insecure Deserialization**: Validate data before deserializing.
9. **Using Components with Known Vulnerabilities**: Regularly update dependencies.
10. **Insufficient Logging & Monitoring**: Implement logging of security events.

## Unit Testing
Unit tests are provided to ensure the functionality of the user service, including registration and login processes.

## Additional Features
- Password generator function to create strong passwords.
- Option for two-factor authentication (2FA) in future updates.

## How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `Main.java` to start the application.