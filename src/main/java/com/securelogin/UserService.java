package main.java.com.securelogin;

import org.mindrot.jbcrypt.BCrypt;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public boolean registerUser(User user) {
        if (users.containsKey(user.getEmail())) {
            return false;  // User already exists
        }
        String hashedPassword = BCrypt.hashpw(user.getPasswordHash(), BCrypt.gensalt());
        user = new User(user.getName(), user.getEmail(), hashedPassword);
        users.put(user.getEmail(), user);
        return true;
    }

    public User login(String email, String password) {
        User user = users.get(email);
        if (user != null && BCrypt.checkpw(password, user.getPasswordHash())) {
            return user;  // Successful login
        }
        return null;  // Failed login
    }
}