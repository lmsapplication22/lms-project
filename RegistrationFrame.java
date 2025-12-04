import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFrame extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton registerButton;

    public RegistrationFrame() {
        setTitle("LMS Registration");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Password:"));
        passwordField = new JTextField();
        panel.add(passwordField);

        panel.add(new JLabel("Role:"));
        roleComboBox = new JComboBox<>(new String[]{"Student", "Teacher", "Admin"});
        panel.add(roleComboBox);

        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
        panel.add(registerButton);

        add(panel);
    }

    private void register() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String role = (String) roleComboBox.getSelectedItem();

        // Add code to handle registration logic (e.g., save to database)
        JOptionPane.showMessageDialog(this, "Registered successfully as " + role);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFrame().setVisible(true);
            }
        });
    }
}