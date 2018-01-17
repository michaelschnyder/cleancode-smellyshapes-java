package com.zuehlke.cleancodeworkshop.smellyshapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {

    @Test
    public void getErrorMessage_invalidColor() {
        Color c = new Color("INVALIDColor_N4me");

        assertEquals("Color not recognized", c.getErrorMessage());
    }

    @Test
    public void getErrorMessage_Magenta() {
        Color c = new Color("Magenta");

        assertEquals("Color not recognized", c.getErrorMessage());
    }

    @Test
    public void getErrorMessage_Cyan() {
        Color c = new Color("Cyan");

        assertEquals("Color not recognized", c.getErrorMessage());
    }


    @Test
    public void getColorFormatted_true() {
        Color c = new Color("Red");

        String formattedColor = c.getColorFormatted(true);

        assertEquals("Red #FF0000 255:0:0", formattedColor);
    }

    @Test
    public void getColorFormatted_false() {
        Color c = new Color("Red");

        String formattedColor = c.getColorFormatted(false);

        assertEquals("Red", formattedColor);
    }

}
