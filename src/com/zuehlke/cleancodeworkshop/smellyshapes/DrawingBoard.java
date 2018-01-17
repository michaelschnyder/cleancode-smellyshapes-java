package com.zuehlke.cleancodeworkshop.smellyshapes;

public class DrawingBoard extends ShapeGroup {

    private Color backgroundColor;

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void drawOnScreen() {
        // ...
    }

    public void load(String file) {
        // ...
    }

    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        drawingBoard.setBackgroundColor(new Color("Green"));
        drawingBoard.add(new Square(-10, -10, 20));
        drawingBoard.load(args[0]);
        drawingBoard.drawOnScreen();
    }
}
