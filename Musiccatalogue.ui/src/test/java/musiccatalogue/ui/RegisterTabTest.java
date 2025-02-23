package musiccatalogue.ui;

import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import static org.junit.Assert.*;

public class RegisterTabTest {
    private RegisterTab registerTab;

    @Before
    public void setUp() {
        // Initialize the RegisterTab
        registerTab = new RegisterTab();
    }

    @Test
    public void testRegistrationSuccess() {
        // Get the components
        JTextField userField = registerTab.getUserField();
        JPasswordField passField = registerTab.getPassField();
        JCheckBox termsCheckbox = registerTab.getTermsCheckbox();

        // Simulate user input
        userField.setText("testuser");
        passField.setText("testpass");
        termsCheckbox.setSelected(true);

        // Verify the inputs
        assertEquals("testuser", userField.getText());
        assertEquals("testpass", new String(passField.getPassword()));
        assertTrue(termsCheckbox.isSelected());
    }
}