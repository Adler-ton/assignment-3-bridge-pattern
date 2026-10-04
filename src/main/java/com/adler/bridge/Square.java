package com.adler.bridge;

/** Refined Abstraction representing a square. */
public final class Square extends Shape {
    private final double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}
