package org.example;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    public GridLayoutExample() {
        setTitle("GridLayout Example - 1*3 Panels");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container mainContainer = getContentPane();
        mainContainer.setLayout(new GridLayout(1,3));
        add(btn1);
        add(btn2);
        add(btn3);
        setSize(400, 300);
        JPanel LeftPanel = new JPanel();
        LeftPanel.setBackground(Color.PINK);
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GREEN);
        JPanel RightPanel = new JPanel();
        RightPanel.setBackground(Color.BLUE);

        mainContainer.add(LeftPanel);
        mainContainer.add(centerPanel);
        mainContainer.add(RightPanel);

        setVisible(true);
    }
}

