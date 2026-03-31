package org.example;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("GridLayout Example - 1*3 Panels");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container mainContainer = getContentPane();
        mainContainer.setLayout(new GridLayout(1,3));
        JPanel LeftPanel = new JPanel();
        LeftPanel.setBackground(Color.RED);
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

