package main.java.com.securelogin;

public class AuthService {
    private UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public User authenticate(String email, String password) {
        return userService.login(email, password);
    }
}