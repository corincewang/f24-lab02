package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(2);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(square);

        renderer.draw();
        renderer2.draw();
    }
}

