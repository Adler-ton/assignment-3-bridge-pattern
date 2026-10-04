package com.adler.bridge;

/**
 * Implementor side of the Bridge pattern.
 * Defines low-level rendering operations used by Shape abstractions.
 */
public interface Renderer {
    void renderCircle(double radius);
    void renderSquare(double side);
}
