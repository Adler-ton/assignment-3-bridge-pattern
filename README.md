# Assignment #3 — Bridge Pattern

**Student:** A.A
**Course:** ShP-2216 – Software Design Patterns (OP 6B06102)  
**Language:** Java 17

## Topic
Shape–Renderer Bridge pattern implementation.

The abstraction hierarchy (`Shape`, `Circle`, `Square`) is separated from the implementation hierarchy (`Renderer`, `VectorRenderer`, `RasterRenderer`). `Shape` keeps a `Renderer` reference, so either hierarchy can evolve independently.

## Project structure

```text
src/main/java/com/adler/bridge/
├── Circle.java
├── Main.java
├── RasterRenderer.java
├── Renderer.java
├── Shape.java
├── Square.java
└── VectorRenderer.java
```

## Requirements
- JDK 17+
- No external dependencies

## Compile and run

From the project directory:

```bash
mkdir -p out
javac -d out src/main/java/com/adler/bridge/*.java
java -cp out com.adler.bridge.Main
```

Expected output:

```text
--- Initial implementation: VectorRenderer ---
Vector: drawing circle with radius 5.00
Vector: drawing square with side 4.00
--- Switched implementation: RasterRenderer ---
Raster: drawing circle with radius 5.00 pixels
Raster: drawing square with side 4.00 pixels
```

## Bridge roles
| Pattern role | Class/interface |
|---|---|
| Abstraction | `Shape` |
| Refined Abstraction | `Circle`, `Square` |
| Implementor | `Renderer` |
| Concrete Implementor | `VectorRenderer`, `RasterRenderer` |
| Client | `Main` |
| Bridge link | `Shape.renderer` |

## Design note
The two dimensions are independent: new shapes can be added without changing renderer classes, and new renderers can be added without changing existing shape classes. The client composes them at runtime rather than relying on inheritance between the two hierarchies.

## GitHub
https://github.com/Adler-ton/assignment-3-bridge-pattern.git
