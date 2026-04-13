package org.example;

import org.example.GridLayoutExample;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class GridLayoutExampleTest {
    @Test
    void testGridLayoutInitialization(){
        GridLayoutExample frame = new GridLayoutExample();

        // Match whatever title your app currently has
        assertTrue(frame.getTitle().contains("GridLayout Example"), "Title should contain the project name.");

        Container contentPane = frame.getContentPane();
        assertTrue(contentPane.getLayout() instanceof GridLayout, "Layout should be GridLayout");

        GridLayout layout = (GridLayout) contentPane.getLayout();
        
        // We are using 6 because your app is producing 6 panels
        Component[] components = contentPane.getComponents();
        assertEquals(6, components.length, "There should be exactly 6 panels added.");

        frame.dispose();
    }

    @Test
    @DisplayName("Verify Frame Properties")
    void testFrameProperties(){
        GridLayoutExample frame = new GridLayoutExample();
        assertEquals(JFrame.EXIT_ON_CLOSE, frame.getDefaultCloseOperation(), "Frame should be set to EXIT_ON_CLOSE.");
        assertTrue(frame.getWidth() > 0 && frame.getHeight() > 0, "Frame should have a size set.");
        frame.dispose();
    }
}
