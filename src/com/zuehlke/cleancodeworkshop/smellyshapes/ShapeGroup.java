package com.zuehlke.cleancodeworkshop.smellyshapes;

public class ShapeGroup extends ComplexShape {

    Shape[] shapes = new Shape[10];
    int size = 0;

    public ShapeGroup() {}

    public ShapeGroup(Shape[] shapes, boolean readOnly) {
        this.shapes = shapes;
        this.size = shapes.length;
        this.readOnly = readOnly;
    }

    public void add(Shape shape) {
        if (!readOnly) {
            int newSize = size + 1;
            if (newSize > shapes.length) {
                Shape[] newShapes = new Shape[shapes.length + 10];
                for (int i = 0; i < size; i++) {
                    newShapes[i] = shapes[i];
                }
                shapes = newShapes;
            }

            if (contains(shape)) {
                return;
            }
            shapes[size++] = shape;
        }
    }

    public boolean contains(Shape shape) {
        for (int i = 0; i < size; i++) {
            if (shapes[i].equals(shape)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(int x, int y) {
        for (Shape shape : shapes) {
            if (shape != null) {
                if (shape.contains(x, y)) {
                    return true;
                }
            }
        }
        return false;
    }
}
