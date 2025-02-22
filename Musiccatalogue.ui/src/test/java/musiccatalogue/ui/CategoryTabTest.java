package musiccatalogue.ui;

import org.testng.annotations.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

 class CategoryTabTest {

    @Test
    void testCreateCategoryTab() {
        CategoryTab categoryTab = new CategoryTab();
        JPanel panel = categoryTab.createCategoryTab();

        // Check if panel is not null
        assertNotNull(panel);

        // Check if panel has components
        assertTrue(panel.getComponentCount() > 0);

        boolean hasLabel = false;
        boolean hasList = false;

        for (Component comp : panel.getComponents()) {
            if (comp instanceof JLabel) {
                hasLabel = true;
            }
            if (comp instanceof JScrollPane) {
                JScrollPane scrollPane = (JScrollPane) comp;
                if (scrollPane.getViewport().getView() instanceof JList) {
                    hasList = true;
                }
            }
        }

        assertTrue(hasLabel);
        assertTrue(hasList);
    }
}
