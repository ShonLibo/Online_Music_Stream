package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;
import javax.swing.DefaultListModel;

public class SignUpTab {
    public JPanel createSignUpTab() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Labels and Input Fields
        panel.add(new JLabel("First Name:"), gbc);
        gbc.gridx = 1;
        JTextField firstNameField = new JTextField(15);
        panel.add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Last Name:"), gbc);
        gbc.gridx = 1;
        JTextField lastNameField = new JTextField(15);
        panel.add(lastNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(15);
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(15);
        panel.add(passwordField, gbc);

        // List Model to store users
        DefaultListModel<String> userList = new DefaultListModel<>();

        // Submit and View Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JButton submitButton = new JButton("Submit");
        JButton viewButton = new JButton("View");

        submitButton.setBackground(new Color(36, 14, 62));
        submitButton.setForeground(Color.WHITE);
        viewButton.setBackground(new Color(36, 14, 62));
        viewButton.setForeground(Color.WHITE);

        buttonPanel.add(submitButton);
        buttonPanel.add(viewButton);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        // Submit Button Action
        submitButton.addActionListener(e -> {
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Save user to list
            userList.addElement(firstName + " " + lastName + " - " + email);
            JOptionPane.showMessageDialog(panel, "Sign Up Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear fields after submission
            firstNameField.setText("");
            lastNameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        });

        // View Button Action
        viewButton.addActionListener(e -> {
            if (userList.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "No users signed up yet.", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JList<String> listView = new JList<>(userList);
                JOptionPane.showMessageDialog(panel, new JScrollPane(listView), "Signed-Up Users", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        return panel;
    }
}