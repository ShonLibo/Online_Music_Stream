package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterTab {
    private JPanel panel;
    private JTextField userField;
    private JPasswordField passField;
    private JCheckBox termsCheckbox;

    public Component CreateRegisterTab() {
        // Initialize the panel
        panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));

        // Initialize the components
        userField = new JTextField(15);
        passField = new JPasswordField(15);
        termsCheckbox = new JCheckBox("Accept terms and conditions");

        // Set up the layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        panel.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        panel.add(passField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(termsCheckbox, gbc);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(36, 14, 62));
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(e -> {
            if (termsCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(panel, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panel, "Please accept the terms and conditions", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(submitButton, gbc);
        return panel;
    }

    // Expose the components for testing
    public JTextField getUserField() {
        return userField;
    }

    public JPasswordField getPassField() {
        return passField;
    }

    public JCheckBox getTermsCheckbox() {
        return termsCheckbox;
    }

    public JPanel getPanel() {
        return panel;
    }
}