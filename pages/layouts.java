package pages;
import javax.swing.*;
import java.awt.*;

public class layouts extends JFrame {

    public layouts() {
        // Set JFrame properties
        setTitle("Scrollable Button Panel");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create a JPanel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1)); // Set the panel layout to a single column
        for (int i = 1; i <= 20; i++) { // Add some buttons to the panel
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        // Create a JScrollPane to hold the panel
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 400, 400); // Set the bounds of the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Always show the vertical scroll
                                                                                      // bar

        // Add the scroll pane to the JFrame
        add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            layouts frame = new layouts();
            frame.setVisible(true);
        });
    }
}
