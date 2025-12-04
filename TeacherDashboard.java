import javax.swing.*;
import java.awt.*;

public class TeacherDashboard {

    public TeacherDashboard() {
        JFrame frame = new JFrame("Teacher Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Adding components
        panel.add(new JLabel("Welcome to the Teacher Dashboard"));
        panel.add(new JLabel(""));  // Empty label for spacing
        panel.add(new JLabel("View Students"));
        panel.add(new JButton("View"));
        panel.add(new JLabel("Manage Assignments"));
        panel.add(new JButton("Manage"));
        panel.add(new JLabel("Grade Students"));
        panel.add(new JButton("Grade"));

        // Add panel to frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeacherDashboard());
    }
}