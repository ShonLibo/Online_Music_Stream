package musiccatalogue.ui;

import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
<<<<<<< HEAD
import java.awt.*;
=======
>>>>>>> 65717d4b7d0fa9268e461d5f494383310b7f4881
import static org.junit.Assert.*;

public class RegisterTabTest {
    private RegisterTab registerTab;

    @Before
    public void setUp() {
        // Initialize the RegisterTab
        registerTab = new RegisterTab();
        // Call CreateRegisterTab to initialize the components
        registerTab.CreateRegisterTab();
    }

    @Test
<<<<<<< HEAD
    public void testCreateRegisterTab() {
        // Verify that the panel is created and not null
        JPanel panel = registerTab.getPanel();
        assertNotNull(panel);

        // Verify that the panel contains the expected components
        Component[] components = panel.getComponents();
        assertEquals(6, components.length); // 4 labels, 2 fields, 1 checkbox, 1 button
    }

    @Test
    public void testGetUserField() {
        // Verify that the userField is initialized and accessible
        JTextField userField = registerTab.getUserField();
        assertNotNull(userField);

        // Simulate user input
        userField.setText("testuser");
        assertEquals("testuser", userField.getText());
    }

    @Test
    public void testGetPassField() {
        // Verify that the passField is initialized and accessible
        JPasswordField passField = registerTab.getPassField();
        assertNotNull(passField);

        // Simulate user input
        passField.setText("testpass");
        assertEquals("testpass", new String(passField.getPassword()));
    }

    @Test
    public void testGetTermsCheckbox() {
        // Verify that the termsCheckbox is initialized and accessible
        JCheckBox termsCheckbox = registerTab.getTermsCheckbox();
        assertNotNull(termsCheckbox);

        // Simulate user interaction
        termsCheckbox.setSelected(true);
        assertTrue(termsCheckbox.isSelected());
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
        termsCheckbox.setSelected(true); // Accept terms and conditions

        // Verify the inputs
        assertEquals("testuser", userField.getText());
        assertEquals("testpass", new String(passField.getPassword()));
        assertTrue(termsCheckbox.isSelected());
    }
=======
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
>>>>>>> 65717d4b7d0fa9268e461d5f494383310b7f4881
}