package com.adler.bridge;

/** Concrete Implementor that renders shapes as vector graphics. */
public final class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("Vector: drawing circle with radius %.2f%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Vector: drawing square with side %.2f%n", side);
    }
}
