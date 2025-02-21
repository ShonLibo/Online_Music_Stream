package musiccatalogue.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserData {
    // Private field to encapsulate the list of users
    private List<String> users;

    public UserData() {
        users = new ArrayList<>();
    }

    // Public method to add a user
    public void addUser(String firstName, String lastName, String email) {
        if (firstName == null || lastName == null || email == null ||
                firstName.trim().isEmpty() || lastName.trim().isEmpty() || email.trim().isEmpty()) {
            throw new IllegalArgumentException("First name, last name, and email cannot be null or empty.");
        }
        users.add(firstName.trim() + " " + lastName.trim() + " - " + email.trim());
    }

    // Public method to get a read-only view of the users list
    public List<String> getUsers() {
        return Collections.unmodifiableList(users); // Prevent external modification
    }

    // Public method to get the number of users
    public int getUserCount() {
        return users.size();
    }
}