import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(400, 480);
        setLayout(new BorderLayout(10, 10));
        setUndecorated(true);

        JPanel center = new JPanel(new GridLayout(5, 4, 10, 10));
        center.setBackground(Color.WHITE);

        JPanel north = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);

        JTextField results = new JTextField(2);
        results.setPreferredSize(new Dimension(0, 50)); 
        north.add(results, gbc);

        JButton clear = new JButton("C");
        JButton integer = new JButton("-/+");
        JButton percent = new JButton("%");
        JButton delete = new JButton("D");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton divide = new JButton("/");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton multiply = new JButton("*");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton subtract = new JButton("-");
        JButton zero = new JButton("0");
        JButton point = new JButton(".");
        JButton equals = new JButton("=");
        JButton add = new JButton("+");

        center.add(clear);
        center.add(integer);
        center.add(percent);
        center.add(delete);
        center.add(seven);
        center.add(eight);
        center.add(nine);
        center.add(divide);
        center.add(four);
        center.add(five);
        center.add(six);
        center.add(multiply);
        center.add(one);
        center.add(two);
        center.add(three);
        center.add(subtract);
        center.add(zero);
        center.add(point);
        center.add(equals);
        center.add(add);
        JPanel west = new JPanel();
        west.setBackground(Color.LIGHT_GRAY);

        JPanel east = new JPanel();
        east.setBackground(Color.LIGHT_GRAY);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
