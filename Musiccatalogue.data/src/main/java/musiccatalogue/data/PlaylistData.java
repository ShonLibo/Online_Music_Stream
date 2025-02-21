package musiccatalogue.data;

import javax.swing.table.DefaultTableModel;

public class PlaylistData {
    // Private fields to encapsulate the data
    private DefaultTableModel tableModel;

    public PlaylistData() {
        tableModel = new DefaultTableModel(new Object[]{"Title", "Artist"}, 0);
    }

    // Public method to add a song
    public void addSong(String title, String artist) {
        if (title == null || artist == null || title.trim().isEmpty() || artist.trim().isEmpty()) {
            throw new IllegalArgumentException("Title and artist cannot be null or empty.");
        }
        tableModel.addRow(new Object[]{title.trim(), artist.trim()});
    }

    // Public method to remove a song by index
    public void removeSong(int index) {
        if (index < 0 || index >= tableModel.getRowCount()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        tableModel.removeRow(index);
    }

    // Public method to get the table model (read-only access)
    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    // Public method to get the number of songs in the playlist
    public int getSongCount() {
        return tableModel.getRowCount();
    }
}