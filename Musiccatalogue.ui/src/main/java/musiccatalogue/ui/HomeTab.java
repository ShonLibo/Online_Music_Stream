package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class HomeTab {
    public JPanel createHomeTab() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240)); // Light gray background


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(240, 240, 240));


        JLabel titleLabel = new JLabel("ONLINE MUSIC STREAM", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30)); // Large, bold font
        titleLabel.setForeground(new Color(36, 14, 62)); // Deep purple
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel descriptionLabel = new JLabel("<html><div style='text-align: center; width: 300px;'>"
                + "Experience unlimited music streaming with a vast collection of songs, "
                + "personalized playlists, and seamless playback."
                + "</div></html>");
        descriptionLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        descriptionLabel.setForeground(new Color(80, 80, 80)); // Gray
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton streamButton = new JButton("🎵 Stream Now");
        streamButton.setBackground(new Color(36, 14, 62)); // Deep Purple
        streamButton.setForeground(Color.WHITE); // White text
        streamButton.setFont(new Font("SansSerif", Font.BOLD, 20));
        streamButton.setFocusPainted(false);
        streamButton.setBorderPainted(false);
        streamButton.setPreferredSize(new Dimension(250, 50));
        streamButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        streamButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


        streamButton.addActionListener(e ->
                JOptionPane.showMessageDialog(panel, "Streaming now...", "Stream", JOptionPane.INFORMATION_MESSAGE)
        );

        // Add spacing and components
        centerPanel.add(Box.createVerticalStrut(50)); // Space from top
        centerPanel.add(titleLabel);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(descriptionLabel);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(streamButton);
        centerPanel.add(Box.createVerticalStrut(50)); // Space at bottom

        panel.add(centerPanel, BorderLayout.CENTER);

        return panel;
    }
}