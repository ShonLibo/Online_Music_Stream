package musiccatalogue.ui;

import musiccatalogue.data.UserData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class SignUpTabTest {

    private SignUpTab signUpTab;
    private UserData userData;

    @BeforeEach
    public void setUp() {
        userData = new UserData();
        signUpTab = new SignUpTab(userData);
    }

    @Test
    public void testCreateSignUpTab() {
        JPanel panel = signUpTab.createSignUpTab();
        assertNotNull(panel);
    }
}
