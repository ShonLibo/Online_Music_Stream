package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class PlaylistTab {
    public JPanel createPlaylistTab() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240)); // Light gray background

        // Table Model & Table
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Title", "Artist"}, 0);
        JTable playlistTable = new JTable(tableModel);
        playlistTable.setFont(new Font("SansSerif", Font.PLAIN, 14));
        playlistTable.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(playlistTable);

        // Button Panel (Bottom)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(240, 240, 240));

        // Add Button
        JButton addButton = new JButton("Add Song");
        addButton.setBackground(new Color(36, 14, 62)); // #240E3E
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        addButton.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(panel, "Enter Song Title:");
            String artist = JOptionPane.showInputDialog(panel, "Enter Artist Name:");

            if (title != null && !title.trim().isEmpty() && artist != null && !artist.trim().isEmpty()) {
                tableModel.addRow(new Object[]{title.trim(), artist.trim()});
            } else {
                JOptionPane.showMessageDialog(panel, "Title and Artist cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Remove Button
        JButton removeButton = new JButton("Remove Song");
        removeButton.setBackground(new Color(36, 14, 62));
        removeButton.setForeground(Color.WHITE);
        removeButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        removeButton.addActionListener(e -> {
            int selectedRow = playlistTable.getSelectedRow();
            if (selectedRow != -1) {
                tableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(panel, "Please select a song to remove", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        // Add Components to Panel
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }
}