import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        // Set frame size and layout
        setSize(700, 600);
        setLayout(new BorderLayout(10, 10));

        // Create the center panel with GridLayout
        JPanel center = new JPanel(new GridLayout(5, 4, 10, 10));
        center.setBackground(Color.WHITE);

        // Create and configure the north panel with GridBagLayout
        JPanel north = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create the results text field and add it to the north panel
        JTextField results = new JTextField(60);
        north.add(results, gbc);

        // Create buttons
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton clear = new JButton("C");
        JButton negative = new JButton("(-)");
        JButton positive = new JButton("(+)");
        JButton equals = new JButton("=");
        JButton point = new JButton(".");

        // Add buttons to the center panel
        center.add(one);
        center.add(two);
        center.add(three);
        center.add(add);
        center.add(four);
        center.add(five);
        center.add(six);
        center.add(subtract);
        center.add(seven);
        center.add(eight);
        center.add(nine);
        center.add(multiply);
        center.add(clear);
        center.add(zero);
        center.add(point);
        center.add(divide);
        center.add(negative);
        center.add(positive);
        center.add(equals);

        // Add panels to the frame
        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        // Set frame properties
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
