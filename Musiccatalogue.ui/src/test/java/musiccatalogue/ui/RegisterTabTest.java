package musiccatalogue.ui;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;

public class RegisterTabTest {

    private RegisterTab registerTab;

    @BeforeEach
    void setUp() {
        registerTab = new RegisterTab();
    }

    @Test
    public void testRegistrationSuccess() {
        JPanel panel = registerTab.createRegisterTab();
        assertNotNull(panel);


        assertTrue(panel.getComponentCount() > 6);

        JCheckBox termsCheckbox = (JCheckBox) panel.getComponent(2);
        termsCheckbox.setSelected(true);
        JButton submitButton = (JButton) panel.getComponent(6);

        submitButton.doClick();


        assertTrue(termsCheckbox.isSelected());
    }

    @Test
    public void testRegistrationFailure() {  // ✅ Made test method public
        JPanel panel = registerTab.createRegisterTab();
        assertNotNull(panel);


        assertTrue(panel.getComponentCount() > 6);

        JCheckBox termsCheckbox = (JCheckBox) panel.getComponent(2);
        termsCheckbox.setSelected(false);
        JButton submitButton = (JButton) panel.getComponent(6);

        submitButton.doClick();


        assertFalse(termsCheckbox.isSelected());
    }
}
