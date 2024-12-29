package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChooseMode implements ActionListener {
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JLabel title = new JLabel();
    JLabel title2 = new JLabel();
    JPanel image_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    ImageIcon image = new ImageIcon("src\\main\\tictactoe.png");

    public ChooseMode() {
        frame.setIconImage(image.getImage());
        frame.setTitle("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(533, 480);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // Title Panel
        title.setBackground(Color.black);
        title.setForeground(Color.green);
        title.setFont(new Font("Comic Sans", Font.ITALIC, 47));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setText("TicTacToe!");
        title.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 533, 200);
        title_panel.add(title);

        // Image Panel
        title2.setVerticalAlignment(JLabel.CENTER);
        title2.setHorizontalAlignment(JLabel.CENTER);
        image_panel.setBackground(Color.lightGray);
        image_panel.setLayout(new BorderLayout());
        image_panel.add(title2);

        // Buttons
        b1.setForeground(new Color(153, 0, 76));
        b1.setFont(new Font("Comic Sans", Font.BOLD, 42));
        b1.setFocusable(false);
        b1.setText("Single Player");
        b1.addActionListener(this);

        b2.setForeground(new Color(153, 0, 76));
        b2.setFont(new Font("Comic Sans", Font.BOLD, 42));
        b2.setFocusable(false);
        b2.setText("Two Players");
        b2.addActionListener(this);

        button_panel.setLayout(new GridLayout(1, 2, 0, 0));
        button_panel.setBackground(Color.gray);
        button_panel.add(b1);
        button_panel.add(b2);

        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(image_panel, BorderLayout.CENTER);
        frame.add(button_panel, BorderLayout.SOUTH);

        // Adjust components dynamically
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int width = frame.getWidth();
                int height = frame.getHeight();

                // Resize ImageIcon
                Image resizedImage = image.getImage().getScaledInstance(width, height * 4/5, Image.SCALE_SMOOTH);
                title2.setIcon(new ImageIcon(resizedImage));

                // Resize button fonts
                b1.setFont(new Font("Comic Sans", Font.BOLD, width / 20));
                b2.setFont(new Font("Comic Sans", Font.BOLD, width / 20));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Single Player mode selected!");
        } else if (e.getSource() == b2) {
            System.out.println("Two Players mode selected!");
            TwoPlayerMode two_player = new TwoPlayerMode();
        }
    }
}
