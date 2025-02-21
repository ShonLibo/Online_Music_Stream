package musiccatalogue.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

class MusicStreamAppTest {

    @Test
    void testMusicStreamAppInitialization() {
        SwingUtilities.invokeLater(() -> {
            MusicStreamApp app = new MusicStreamApp();
            assertNotNull(app, "Application should be initialized");
            assertEquals("Online Music Stream", app.getTitle());
            assertEquals(700, app.getWidth());
            assertEquals(400, app.getHeight());
            assertEquals(JFrame.EXIT_ON_CLOSE, app.getDefaultCloseOperation());

            Component[] components = app.getContentPane().getComponents();
            assertTrue(components.length > 0);
        });
    }
}
