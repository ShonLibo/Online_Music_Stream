package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterTab {
    public JPanel createRegisterTab() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("UserName:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JCheckBox termsCheckbox = new JCheckBox("Accept terms and conditions");

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

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel, gbc);
        gbc.gridx = 1;
        panel.add(userField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passLabel, gbc);
        gbc.gridx = 1;
        panel.add(passField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(termsCheckbox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(submitButton, gbc);

        return panel;
    }
}