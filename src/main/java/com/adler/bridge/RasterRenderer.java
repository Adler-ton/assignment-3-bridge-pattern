package com.adler.bridge;

/** Concrete Implementor that renders shapes as raster graphics. */
public final class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("Raster: drawing circle with radius %.2f pixels%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Raster: drawing square with side %.2f pixels%n", side);
    }
}
