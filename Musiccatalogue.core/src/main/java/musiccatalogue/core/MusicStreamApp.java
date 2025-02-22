package musiccatalogue.core;

import musiccatalogue.data.PlaylistData;
import musiccatalogue.data.UserData;
import musiccatalogue.ui.*;
import javax.swing.*;
import java.awt.*;

public class MusicStreamApp extends JFrame {
    private PlaylistData playlistData;
    private UserData userData;

    public MusicStreamApp() {
        // Initialize data instances
        playlistData = new PlaylistData();
        userData = new UserData();

        // Set up the JFrame
        setTitle("Online Music Stream");
        setSize(700, 400); // Adjusted frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Home", new HomeTab().createHomeTab());
        tabbedPane.addTab("Register", new RegisterTab().CreateRegisterTab());
        tabbedPane.addTab("SignUp", new SignUpTab(userData).createSignUpTab());
        tabbedPane.addTab("Category", new CategoryTab().createCategoryTab());
        tabbedPane.addTab("Playlist", new PlaylistTab(playlistData).createPlaylistTab());
        tabbedPane.setBackground(new Color(36, 14, 62));
        tabbedPane.setForeground(Color.WHITE);

        // Create a JPanel for the tabs (Center)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(tabbedPane, BorderLayout.CENTER);

        // Create a west panel with left-aligned text and breathing space
        JPanel westPanel = new JPanel(new BorderLayout());
        westPanel.setBackground(new Color(240, 240, 240)); // Light gray background
        westPanel.setPreferredSize(new Dimension(220, 500));
        westPanel.setBackground(new Color(36, 14, 62));

        // Adjust width
        JTextArea descriptionText = new JTextArea(
                "Welcome to Online Music Stream\n\n"
                        + "Stream your favorite songs, register, and enjoy various categories of music.\n\n"
                        + "Create playlists, explore new genres, and experience unlimited streaming.\n\n"
                        + "Enjoy an amazing music experience!"
        );
        descriptionText.setFont(new Font("Serif", Font.PLAIN, 16));
        descriptionText.setForeground(Color.white);
        descriptionText.setBackground(new Color(36, 14, 62));
        descriptionText.setWrapStyleWord(true);
        descriptionText.setLineWrap(true);
        descriptionText.setEditable(false);
        descriptionText.setMargin(new Insets(20, 20, 20, 20)); // Breathing space from edges

        westPanel.add(descriptionText, BorderLayout.CENTER);

        // Add the panels to the frame
        add(topPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new MusicStreamApp();
    }
}