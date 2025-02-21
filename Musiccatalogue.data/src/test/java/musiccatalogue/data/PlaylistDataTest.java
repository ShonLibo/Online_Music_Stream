package musiccatalogue.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.table.DefaultTableModel;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistDataTest {
    private PlaylistData playlist;

    @BeforeEach
    void setUp() {
        playlist = new PlaylistData();

    }

    @Test
    void addSong() {
        playlist.addSong("Song Title", "Artist Name");
        DefaultTableModel model = playlist.getTableModel();
        assertEquals(1, model.getRowCount());
        assertEquals("Song Title", model.getValueAt(0, 0));
        assertEquals("Artist Name", ((DefaultTableModel) model).getValueAt(0, 1));
    }

    @Test
    void removeSong() {
    }

    @Test
    void getTableModel() {
    }

    @Test
    void getSongCount() {
    }
}