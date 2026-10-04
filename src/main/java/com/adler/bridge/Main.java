package com.adler.bridge;

/** Client demonstrating runtime composition and switching of implementations. */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        Shape square = new Square(vectorRenderer, 4.0);

        System.out.println("--- Initial implementation: VectorRenderer ---");
        circle.draw();
        square.draw();

        // Same abstraction classes, different implementation objects.
        circle = new Circle(rasterRenderer, 5.0);
        square = new Square(rasterRenderer, 4.0);

        System.out.println("--- Switched implementation: RasterRenderer ---");
        circle.draw();
        square.draw();
    }
}
