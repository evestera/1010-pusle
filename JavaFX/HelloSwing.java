import javax.swing.*;
import javax.swing.border.*;

public class HelloSwing {
    public static void start() {
        JFrame frame = new JFrame("myApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        label.setBorder(new EmptyBorder(50, 50, 50, 50));
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HelloSwing::start);
    }
}