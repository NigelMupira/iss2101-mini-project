package test.java.com.securelogin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private final UserService userService = new UserService();

    @Test
    public void testUserRegistration() {
        User user = new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!");
        assertTrue(userService.registerUser(user));
    }

    @Test
    public void testDuplicateUserRegistration() {
        User user1 = new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!");
        userService.registerUser(user1);
        User user2 = new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!");
        assertFalse(userService.registerUser(user2));  // Should fail due to duplicate
    }

    @Test
    public void testUserLogin() {
        userService.registerUser(new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!"));
        User loggedInUser = userService.login("h230828v@hit.ac.zw", "Password123!");
        assertNotNull(loggedInUser);
        assertEquals("Jane Doe", loggedInUser.getName());
    }

    @Test
    public void testFailedLogin() {
        userService.registerUser(new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!"));
        User loggedInUser = userService.login("h230828v@hit.ac.zw", "WrongPassword");
        assertNull(loggedInUser);  // Should return null on failed login
    }
}