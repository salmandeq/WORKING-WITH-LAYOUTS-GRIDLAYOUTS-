
import org.example.GridLayoutExample;
import org.junit.jupiter.api.DisplayName;
import org.junit. jupiter.api.Test;
import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class GridLayoutExampletest {
    @Test
     void testGridLayoutInitialization(){
        GridLayoutExample frame = new GridLayoutExample();

        assertEquals("GridLayout Example - 1*3 Panels",frame.getTitle(),"Title should match the constructor setting.");

        Container contenPane =frame.getContentPane();
        assertTrue(contenPane.getLayout() instanceof GridLayout,"layout Should be Gridlayout");

        GridLayout layout = (GridLayout) contenPane.getLayout();
        assertEquals(1,layout.getRows(), "should have 1 row.");
        assertEquals(3,layout.getColumns(), " should have 3 columns.");

        Component[] components=contenPane.getComponents();
        assertEquals(3,components.length, "Ther should be exacly 3 panels added.");

        assertEquals(Color.RED,components[0].getBackground(),"First panel should be ORANGE.");
        assertEquals(Color.GREEN,components[1].getBackground(),"Second panel should be GREEN.");
        assertEquals(Color.BLUE,components[2].getBackground(),"Third panel should be BLUE.");

        frame.dispose();
    }
    @Test
    @DisplayName("Verifly Frame Properties")
    void testFrameProperties(){
        GridLayoutExample frame = new GridLayoutExample();

        assertEquals(JFrame.EXIT_ON_CLOSE,frame.getDefaultCloseOperation(),"Frame should be set to EXIT_ON_CLOSE.");
        assertTrue(frame.getWidth()>0 && frame.getHeight()>0,"Frame should have a size set.");
    }
}
