package com.zuehlke.cleancodeworkshop.smellyshapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(0, 0, 2, 1);
    }

    @Test
    public void contains() {
        assertTrue(rectangle.contains(0, 0));
        assertTrue(rectangle.contains(1, 0));
        assertTrue(rectangle.contains(1, 1));
        assertTrue(rectangle.contains(2, 1));

        assertFalse(rectangle.contains(2, 2));
        assertFalse(rectangle.contains(-1, 0));
        assertFalse(rectangle.contains(0, -1));
    }

    @Test
    public void calculateArea() {
        assertEquals(2, rectangle.calculate());
    }

    @Test
    public void toXml() {
        String xml = rectangle.toXml();

        assertEquals("<rectangle x=\"0\" y=\"0\" width=\"2\" height=\"1\" />\n", xml);
    }

    @Test
    public void toString_() {

        assertEquals("Rectangle: (0,0) width=2 height=1 color=#00FF00", rectangle.toString());
    }
}
