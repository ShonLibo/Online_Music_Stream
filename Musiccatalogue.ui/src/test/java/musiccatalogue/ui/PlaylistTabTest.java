package musiccatalogue.ui;

import musiccatalogue.data.PlaylistData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlaylistTabTest {
    private PlaylistTab playlistTab;

    @BeforeEach
    void setUp() {
        PlaylistData playlistData = new PlaylistData();
        playlistTab = new PlaylistTab(playlistData);
    }

    @Test
    void testCreatePlaylistTab() {
        JPanel panel = playlistTab.createPlaylistTab();


        assertNotNull(panel);


        assertTrue(panel.getComponentCount() > 0);

        boolean hasTable = false;
        boolean hasButtons = false;

        for (Component comp : panel.getComponents()) {
            if (comp instanceof JScrollPane) {
                JScrollPane scrollPane = (JScrollPane) comp;
                if (scrollPane.getViewport().getView() instanceof JTable) {
                    hasTable = true;
                }
            }
            if (comp instanceof JPanel) {
                JPanel buttonPanel = (JPanel) comp;
                for (Component innerComp : buttonPanel.getComponents()) {
                    if (innerComp instanceof JButton) {
                        hasButtons = true;
                    }
                }
            }
        }

        assertTrue(hasTable);
        assertTrue(hasButtons);
    }
}
