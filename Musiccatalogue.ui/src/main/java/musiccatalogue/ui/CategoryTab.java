package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;
import javax.swing.DefaultListModel;

public class CategoryTab {
    public JPanel createCategoryTab() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240)); // Light gray background

        // Label for instructions
        JLabel categoryLabel = new JLabel("Select Your Category:");
        categoryLabel.setForeground(new Color(0, 0, 128)); // Navy blue text
        categoryLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        categoryLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Category List
        DefaultListModel<String> categoryListModel = new DefaultListModel<>();
        categoryListModel.addElement("Hip-hop");
        categoryListModel.addElement("Rap");
        categoryListModel.addElement("Reggae");
        categoryListModel.addElement("Jazz");
        categoryListModel.addElement("Pop");
        categoryListModel.addElement("Rock");

        JList<String> categoryList = new JList<>(categoryListModel);
        categoryList.setFont(new Font("SansSerif", Font.PLAIN, 14));
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(categoryList);
        scrollPane.setPreferredSize(new Dimension(200, 150));

        // Button panel at the bottom (South)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(240, 240, 240)); // Light gray background

        // Select Button
        JButton selectButton = new JButton("Select");
        selectButton.setBackground(new Color(36, 14, 62)); // #240E3E
        selectButton.setForeground(Color.WHITE); // White text
        selectButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        selectButton.addActionListener(e -> {
            String selectedCategory = categoryList.getSelectedValue();
            if (selectedCategory != null) {
                JOptionPane.showMessageDialog(panel, "Selected Category: " + selectedCategory, "Category Selected", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panel, "Please select a category", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // View All Button
        JButton viewButton = new JButton("View All");
        viewButton.setBackground(new Color(36, 14, 62)); // #240E3E
        viewButton.setForeground(Color.WHITE); // White text
        viewButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        viewButton.addActionListener(e -> {
            StringBuilder allCategories = new StringBuilder("Available Categories:\n");
            for (int i = 0; i < categoryListModel.getSize(); i++) {
                allCategories.append("- ").append(categoryListModel.getElementAt(i)).append("\n");
            }
            JOptionPane.showMessageDialog(panel, allCategories.toString(), "All Categories", JOptionPane.INFORMATION_MESSAGE);
        });

        buttonPanel.add(selectButton);
        buttonPanel.add(viewButton);

        // Add components to the main panel
        panel.add(categoryLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }
}