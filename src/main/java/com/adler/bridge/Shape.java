package com.adler.bridge;

/**
 * Abstraction side of the Bridge pattern.
 * Holds a reference to the Implementor instead of inheriting from it.
 */
public abstract class Shape {
    protected final Renderer renderer;

    protected Shape(Renderer renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer must not be null");
        }
        this.renderer = renderer;
    }

    public abstract void draw();
}
