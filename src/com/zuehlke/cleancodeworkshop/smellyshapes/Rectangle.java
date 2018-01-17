package com.zuehlke.cleancodeworkshop.smellyshapes;


public class Rectangle extends SimpleShape {

    protected Color c = new Color("Blue");
    private int x;
    private int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(int x, int y) {
        return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height;
    }

    public int calculate() {
        return width*height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", x, y, width, height,
                             c.getColorAsHex());
    }
}
