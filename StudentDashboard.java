import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the Student Dashboard");
        welcomeLabel.setBounds(10, 20, 300, 25);
        panel.add(welcomeLabel);

        JButton viewCoursesButton = new JButton("View Courses");
        viewCoursesButton.setBounds(10, 80, 150, 25);
        panel.add(viewCoursesButton);

        JButton submitAssignmentButton = new JButton("Submit Assignment");
        submitAssignmentButton.setBounds(10, 120, 150, 25);
        panel.add(submitAssignmentButton);

        JButton viewGradesButton = new JButton("View Grades");
        viewGradesButton.setBounds(10, 160, 150, 25);
        panel.add(viewGradesButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(10, 200, 150, 25);
        panel.add(logoutButton);

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle logout logic
                System.exit(0);
            }
        });
    }
}