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

        // Must match the exact string in your main code
        assertEquals("GridLayout Example - 2*3 Panels", frame.getTitle(), "Title should match.");

        Container contentPane = frame.getContentPane();
        assertTrue(contentPane.getLayout() instanceof GridLayout, "Layout should be GridLayout");

        GridLayout layout = (GridLayout) contentPane.getLayout();
        assertEquals(2, layout.getRows(), "Should have 2 rows.");
        assertEquals(3, layout.getColumns(), "Should have 3 columns.");

        Component[] components = contentPane.getComponents();
        assertEquals(6, components.length, "There should be exactly 6 panels added.");

        assertEquals(Color.RED, components[0].getBackground(), "First panel should be RED.");
        assertEquals(Color.GREEN, components[1].getBackground(), "Second panel should be GREEN.");
        assertEquals(Color.BLUE, components[2].getBackground(), "Third panel should be BLUE.");

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
