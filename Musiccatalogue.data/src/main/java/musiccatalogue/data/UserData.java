package musiccatalogue.data;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private List<String> users = new ArrayList<>();

    public void addUser(String firstName, String lastName, String email) {
        users.add(firstName + " " + lastName + " - " + email);
    }

    public List<String> getUsers() {
        return users;
    }
}