package musiccatalogue.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class UserDataTest {

    @Test
    void testAddUser() {
        UserData userData = new UserData();
        userData.addUser("John", "Doe", "john.doe@example.com");

        List<String> users = userData.getUsers();
        assertEquals(1, users.size(), "User list should contain one user");
        assertEquals("John Doe - john.doe@example.com", users.get(0));
    }



}
