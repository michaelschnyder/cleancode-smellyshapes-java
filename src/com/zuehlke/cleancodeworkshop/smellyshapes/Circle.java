package com.zuehlke.cleancodeworkshop.smellyshapes;

public class Circle extends SimpleShape {

    private int x;
    private int y;
    private int radius;
    private int numberOfContainingPoints;
    private Color color = new Color("Green");

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean contains(int x, int y) {
        boolean result = (x - this.x)*(x - this.x) + (y - this.y)*(y - this.y) <= radius*radius;
        if (result == true) {
            numberOfContainingPoints++;
        }
        return result;
    }

    public int countContainingPoints(int[] xCords, int[] yCords) {
        numberOfContainingPoints = 0;
        for (int i = 0; i < xCords.length; ++i) {
            contains(xCords[i], yCords[i]);
        }
        return numberOfContainingPoints;
    }

    /**
     * This method returns the shape color.
     *
     * @return the shape color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the shape color
     *
     * @param color the new color of the shape
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle: (" + this.x + "," + this.y + ") radius= " + radius
                + " RGB=" + this.color.getRed() + ","
                + this.color.getGreen() + ","
                + this.color.getBlue();
    }
}
