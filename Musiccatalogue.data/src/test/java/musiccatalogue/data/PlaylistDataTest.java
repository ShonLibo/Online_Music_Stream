package musiccatalogue.data;

import org.junit.Before;
import org.junit.Test;
import javax.swing.table.DefaultTableModel;
import static org.junit.Assert.*;

public class PlaylistDataTest {
    private PlaylistData playlistData;

    @Before
    public void setUp() {
        // Initialize PlaylistData before each test
        playlistData = new PlaylistData();
    }

    @Test
    public void testAddSong() {
        // Add a song
        playlistData.addSong("Song Title", "Artist Name");

        // Verify the song was added
        DefaultTableModel tableModel = playlistData.getTableModel();
        assertEquals(1, tableModel.getRowCount()); // Check that one row was added
        assertEquals("Song Title", tableModel.getValueAt(0, 0)); // Check the title
        assertEquals("Artist Name", tableModel.getValueAt(0, 1)); // Check the artist
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSongWithEmptyTitle() {
        // Attempt to add a song with an empty title
        playlistData.addSong("", "Artist Name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSongWithEmptyArtist() {
        // Attempt to add a song with an empty artist
        playlistData.addSong("Song Title", "");
    }

    @Test
    public void testRemoveSong() {
        // Add a song
        playlistData.addSong("Song Title", "Artist Name");

        // Remove the song
        playlistData.removeSong(0);

        // Verify the song was removed
        DefaultTableModel tableModel = playlistData.getTableModel();
        assertEquals(0, tableModel.getRowCount()); // Check that no rows remain
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveSongWithInvalidIndex() {
        // Attempt to remove a song with an invalid index
        playlistData.removeSong(0); // No songs have been added yet
    }

    @Test
    public void testGetTableModel() {
        // Verify the table model is initialized correctly
        DefaultTableModel tableModel = playlistData.getTableModel();
        assertNotNull(tableModel); // Check that the table model is not null
        assertEquals(2, tableModel.getColumnCount()); // Check the number of columns
        assertEquals("Title", tableModel.getColumnName(0)); // Check the first column name
        assertEquals("Artist", tableModel.getColumnName(1)); // Check the second column name
    }
}