package musiccatalogue.ui;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomeTabTest {

    @Test
    public void testCreateHomeTab() {
        HomeTab homeTab = new HomeTab();
        JPanel panel = homeTab.createHomeTab();

        assertNotNull(panel);


        assertTrue(panel.getComponentCount() > 0);

        boolean hasLabel = false;
        boolean hasButton = false;

        for (Component comp : panel.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel innerPanel = (JPanel) comp;
                for (Component innerComp : innerPanel.getComponents()) {
                    if (innerComp instanceof JLabel) {
                        hasLabel = true;
                    }
                    if (innerComp instanceof JButton) {
                        hasButton = true;
                    }
                }
            }
        }

        assertTrue(hasLabel);
        assertTrue(hasButton);
    }
}
