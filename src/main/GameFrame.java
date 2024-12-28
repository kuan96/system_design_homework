package main;

import java.awt.*;
import javax.swing.*;

public class GameFrame {

    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel button = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];

    public GameFrame() {
        frame.setTitle("Tic Tac Toe");
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.darkGray);
        textfield.setForeground(Color.white);
        textfield.setFont(new Font("Comic Sans", Font.ITALIC, 50));
        textfield.setHorizontalAlignment(SwingConstants.CENTER);
        textfield.setText("Single Mode");
        textfield.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setPreferredSize(new Dimension(600, 120)); 
        title.add(textfield);

        button.setLayout(new GridLayout(3, 3));
        button.setBackground(Color.gray);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 100));
            buttons[i].setFocusable(false);
        }

        frame.add(title, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
    }

}
