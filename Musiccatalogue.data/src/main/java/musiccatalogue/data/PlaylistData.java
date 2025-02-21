package musiccatalogue.data;

import javax.swing.table.DefaultTableModel;

public class PlaylistData {
    private DefaultTableModel tableModel;

    public PlaylistData() {
        tableModel = new DefaultTableModel(new Object[]{"Title", "Artist"}, 0);
    }

    public void addSong(String title, String artist) {
        tableModel.addRow(new Object[]{title, artist});
    }

    public void removeSong(int index) {
        tableModel.removeRow(index);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
}