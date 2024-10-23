package test.java.com.securelogin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private final UserService userService = new UserService();

    @Test
    public void testUserRegistration() {
        User user = new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!");
        boolean isRegistered = userService.registerUser(user);
        assertTrue(isRegistered);
    }

    @Test
    public void testUserLogin() {
        userService.registerUser(new User("Nigel Mupira", "h230828v@hit.ac.zw", "Password123!"));
        User loggedInUser = userService.login("h230828v@hit.ac.zw", "Password123!");
        assertNotNull(loggedInUser);
        assertEquals("Nigel Mupira", loggedInUser.getName());
    }
}