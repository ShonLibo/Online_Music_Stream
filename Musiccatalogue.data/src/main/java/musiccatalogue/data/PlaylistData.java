package musiccatalogue.data;

import javax.swing.table.DefaultTableModel;

public class PlaylistData {
    private DefaultTableModel tableModel;

    public PlaylistData() {
        // Initialize the table model with columns "Title" and "Artist"
        tableModel = new DefaultTableModel(new Object[]{"Title", "Artist"}, 0);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void addSong(String title, String artist) {
        if (title == null || title.trim().isEmpty() || artist == null || artist.trim().isEmpty()) {
            throw new IllegalArgumentException("Title and Artist cannot be empty!");
        }
        tableModel.addRow(new Object[]{title.trim(), artist.trim()});
    }

    public void removeSong(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= tableModel.getRowCount()) {
            throw new IndexOutOfBoundsException("Invalid row index: " + rowIndex);
        }
        tableModel.removeRow(rowIndex);
    }
}