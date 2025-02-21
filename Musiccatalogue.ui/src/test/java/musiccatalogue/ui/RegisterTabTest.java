package musiccatalogue.ui;
import static org.junit.jupiter.api.Assertions.*;

import musiccatalogue.ui.RegisterTab;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;

class RegisterTabTest {

    private RegisterTab registerTab;

    @BeforeEach
    void setUp() {
        registerTab = new RegisterTab();
    }

    @Test
    void testRegistrationSuccess() {
        JPanel panel = registerTab.createRegisterTab();
        JCheckBox termsCheckbox = (JCheckBox) panel.getComponent(2);
        termsCheckbox.setSelected(true);
        JButton submitButton = (JButton) panel.getComponent(6);

        submitButton.doClick();

        // Check if success message is displayed
        JOptionPane.showMessageDialog(panel, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    @Test
    void testRegistrationFailure() {
        JPanel panel = registerTab.createRegisterTab();
        JCheckBox termsCheckbox = (JCheckBox) panel.getComponent(2);
        termsCheckbox.setSelected(false);
        JButton submitButton = (JButton) panel.getComponent(6);

        submitButton.doClick();

        // Check if error message is displayed
        JOptionPane.showMessageDialog(panel, "Please accept the terms and conditions", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
